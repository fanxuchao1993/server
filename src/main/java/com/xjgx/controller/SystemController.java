package com.xjgx.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.xjgx.physical.config.PhysicalConfig;
import com.xjgx.util.ResultDto;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

@RestController
@RequestMapping("/system")
public class SystemController {

	@Autowired
	private PhysicalConfig config;

	/**
	 * 用于返回当前服务配置
	 */
	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public ResultDto config() {
		Map<String, String> map = new HashMap<>();
		map.put("name", config.getName());
		map.put("mode", config.getMode());
		map.put("version", config.getVersion());
		return ResultDto.ResultSuccess(map);
	}

	/**
	 * 获取服务当前时间
	 */
	@RequestMapping("/getSystemTime")
	public ResultDto getSystemTime() {
		return ResultDto.ResultSuccess(new Date().getTime());
	}

	@RequestMapping("/getUUID")
	public ResultDto getUUID() {
		return ResultDto.ResultSuccess(UUID.randomUUID().toString().replace("-", ""));
	}

	@RequestMapping("/upload")
	public ResultDto uploadImg(@RequestParam("file") MultipartFile file) {
		if (StrUtil.isEmpty(config.getUploadPath())) {
			return ResultDto.ResultFail("后端未配置图片上传路径", null);
		}
		String prefix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		// if (prefix != null && !"png".equals(prefix.toLowerCase()) &&
		// !"jpg".equals(prefix.toLowerCase())
		// && !"gif".equals(prefix.toLowerCase()) &&
		// !"jepg".equals(prefix.toLowerCase())) {
		// return ResultDto.ResultFail("图片上传只支持png、jpg、gif格式！", null);
		// }
		String path = config.getUploadPath() + DateUtil.format(new Date(), "yyyyMMdd");
		File dir = new File(path);
		dir.mkdirs();
		String fileName = UUID.randomUUID().toString().replace("-", "") + "." + prefix;
		path += (File.separator + fileName);
		File newFile = new File(path);
		try {
			newFile.createNewFile();
			try (FileOutputStream fos = new FileOutputStream(newFile)) {
				fos.write(file.getBytes());
				fos.flush();
			} catch (IOException e) {
				e.printStackTrace();
				return ResultDto.ResultFail("文件写入失败！", e.getMessage());
			}
		} catch (IOException e1) {
			e1.printStackTrace();
			return ResultDto.ResultFail("创建文件失败！", e1.getMessage());
		}
		return ResultDto.ResultSuccess(DateUtil.format(new Date(), "yyyyMMdd") + "/" + fileName);
	}

	@RequestMapping("/uploads")
	public ResultDto uploadImg(@RequestParam("file") MultipartFile[] files) {
		if (StrUtil.isEmpty(config.getUploadPath())) {
			return ResultDto.ResultFail("后端未配置图片上传路径", null);
		}
		if (files != null && files.length > 0) {
			List<String> paths = new ArrayList<String>();
			for (MultipartFile file : files) {
				String prefix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
				// if (prefix != null && !"png".equals(prefix.toLowerCase()) &&
				// !"jpg".equals(prefix.toLowerCase())
				// && !"gif".equals(prefix.toLowerCase()) &&
				// !"jepg".equals(prefix.toLowerCase())) {
				// return ResultDto.ResultFail("图片上传只支持png、jpg、gif格式！", null);
				// }
				String path = config.getUploadPath() + DateUtil.format(new Date(), "yyyyMMdd");
				File dir = new File(path);
				dir.mkdirs();
				String fileName = UUID.randomUUID().toString().replace("-", "") + "." + prefix;
				path += (File.separator + fileName);
				File newFile = new File(path);
				try {
					newFile.createNewFile();
					try (FileOutputStream fos = new FileOutputStream(newFile)) {
						fos.write(file.getBytes());
						fos.flush();
					} catch (IOException e) {
						e.printStackTrace();
						return ResultDto.ResultFail("文件写入失败！", e.getMessage());
					}
				} catch (IOException e1) {
					e1.printStackTrace();
					return ResultDto.ResultFail("创建文件失败！", e1.getMessage());
				}
				paths.add(DateUtil.format(new Date(), "yyyyMMdd") + "/" + fileName);
			}
			return ResultDto.ResultSuccess(paths);
		} else {
			return ResultDto.ResultFail("未接收到需要上传的文件", null);
		}

	}

}

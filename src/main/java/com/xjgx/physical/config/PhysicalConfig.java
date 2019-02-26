package com.xjgx.physical.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 系统配置类
 */
@Configuration  
public class PhysicalConfig {
	@Value("${config.name}")
	private String name;
	@Value("${config.mode}")
	private String mode;
	@Value("${config.version}")
	private String version;
	@Value("${config.upload-path}")
	private String uploadPath;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	
}

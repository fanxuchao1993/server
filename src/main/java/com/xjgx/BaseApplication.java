package com.xjgx;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
public class BaseApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BaseApplication.class, args);
	}

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	/**
	 * 注册DruidServlet 可以通过当前项目访问路径+ /druid/ 进行访问
	 *
	 * @return
	 */
	@Bean
	public ServletRegistrationBean druidServletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
		servletRegistrationBean.setServlet(new DruidServlet());
		servletRegistrationBean.addUrlMappings("/druid/*");
		return servletRegistrationBean;
	}

	class DruidServlet extends StatViewServlet {

		/**
		 *
		 */
		private static final long serialVersionUID = 5658855104152927816L;

		@Override
		public void init() throws ServletException {
			this.username = "root";
			this.password = "java@1234";
			// this.allowList.add(new IPRange("127.0.0.1"));
		}

	}

	/**
	 * 注册DruidFilter拦截
	 *
	 * @return
	 */
	@Bean
	public FilterRegistrationBean duridFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		Map<String, String> initParams = new HashMap<>();
		// 设置忽略请求
		initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
		filterRegistrationBean.setInitParameters(initParams);
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

}

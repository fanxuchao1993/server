package com.xjgx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 
 * @author 孙军
 * @date 2018年3月18日 上午11:04:36 
 * @Description: TODO 用于在各种服务器软件下运行的类
 *
 */
public class ServletInitializer  extends SpringBootServletInitializer {  

    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(BaseApplication.class);  
    }  

}  
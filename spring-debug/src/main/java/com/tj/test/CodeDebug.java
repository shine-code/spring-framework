package com.tj.test;

import com.tj.test.bean.AppConfig;
import com.tj.test.bean.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * 
 * @author: TJ
 * @date:  2022-06-09
 **/
public class CodeDebug {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = (UserService)context.getBean("userService");
		service.save();

		AppConfig appConfig = (AppConfig) context.getBean("appConfig");
		appConfig.testConfig();
	}
}

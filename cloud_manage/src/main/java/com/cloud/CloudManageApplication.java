package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:00
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudManageApplication.class, args);
	}

}

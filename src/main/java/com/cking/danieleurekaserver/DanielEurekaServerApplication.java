package com.cking.danieleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * eureka服务器
 * @author Jenson
 * 2017年10月4日 上午10:50:01
 */
@EnableEurekaServer
@SpringBootApplication
public class DanielEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println(33333);
		SpringApplication.run(DanielEurekaServerApplication.class, args);
	}
}

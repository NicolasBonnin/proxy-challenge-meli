package com.meli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MeliProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeliProxyApplication.class, args);
	}

}

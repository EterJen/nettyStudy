package com.gwideal.jyjapp;

import com.gwideal.jyjapp.nettytcp.NettyTcpApp;
import com.gwideal.jyjapp.nettytcp.config.NettyTcpConfig;
import com.gwideal.jyjapp.utils.BeanUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JyjappApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JyjappApplication.class, args);
		BeanUtil.applicationContext = applicationContext;
		NettyTcpConfig nettyTcpConfig = BeanUtil.getBean(NettyTcpConfig.class);
		NettyTcpApp.start(nettyTcpConfig);
	}

}

package com.gwideal.jyjapp;

import com.gwideal.jyjapp.nettytcp.config.NettyTcpConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class MyConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "netty-tcp-config")
    public NettyTcpConfig nettyTcpConfig() {
        return new NettyTcpConfig();
    }
}

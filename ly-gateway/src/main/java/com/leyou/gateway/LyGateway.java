package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class LyGateway {
    public static void main(String[] args) {
        //网关启动器
        SpringApplication.run(LyGateway.class);
    }
}

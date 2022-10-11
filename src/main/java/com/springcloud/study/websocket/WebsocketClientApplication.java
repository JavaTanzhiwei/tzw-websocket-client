package com.springcloud.study.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类 描 述: 启动类
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
@SpringBootApplication
@Slf4j
public class WebsocketClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketClientApplication.class, args);
        log.info("启动成功。。。。。。。。。。。。。。。");
    }

}

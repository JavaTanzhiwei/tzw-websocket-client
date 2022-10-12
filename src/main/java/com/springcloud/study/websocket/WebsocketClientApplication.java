package com.springcloud.study.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类 描 述: WebSocket启动类
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
@SpringBootApplication
@Slf4j
public class WebsocketClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketClientApplication.class, args);
        log.info("(♥◠‿◠)ﾉﾞ  WebSocket启动成功   ლ(´ڡ`ლ)" +
                " _                 \n" +
                "| |_ ______      __\n" +
                "| __|_  /\\ \\ /\\ / /\n" +
                "| |_ / /  \\ V  V / \n" +
                " \\__/___|  \\_/\\_/ ");
    }

}

package com.springcloud.study.websocket.clients;

import com.springcloud.study.websocket.bean.MyWebSocketClient;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;

/**
 * 类 描 述: 下线通知
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
@Slf4j
public class Clients {
    static Boolean isDo = true;

    @SneakyThrows
    public static void main(String[] args) {
        MyWebSocketClient client = new MyWebSocketClient(new URI("ws://localhost:8012/websocket/LOGOFF_NOTICE/4:64378994-d822-49ce-8242-b9a4c237405c"));
        connect(client);
    }

    public static void connect(MyWebSocketClient client) throws InterruptedException {
        client.connect();
        Thread.sleep(2_000);
        while (isDo) {
            if (!client.isOpen()) {
                try {
                    client.reconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                    log.info("WebSocket连接异常");
                }
            }
        }
    }
}

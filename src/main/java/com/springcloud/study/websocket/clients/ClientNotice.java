package com.springcloud.study.websocket.clients;

import com.springcloud.study.websocket.bean.MyWebSocketClient;
import lombok.SneakyThrows;

import java.net.URI;

/**
 * 类 描 述: WebSocket通知
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
public class ClientNotice {
    @SneakyThrows
    public static void main(String[] args) {
        MyWebSocketClient client = new MyWebSocketClient( new URI("ws://localhost:8012/websocket/KAFKA_NOTICE/36pE6sLIQJLSdgdYXtjRl2LM8w69FGCq"));
        Clients.connect(client);
    }
}

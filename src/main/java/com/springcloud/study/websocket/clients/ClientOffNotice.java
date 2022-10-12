package com.springcloud.study.websocket.clients;

import com.springcloud.study.websocket.bean.MyWebSocketClient;
import lombok.SneakyThrows;

import java.net.URI;

/**
 * 类 描 述: 下线通知
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
public class ClientOffNotice {
    @SneakyThrows
    public static void main(String[] args) {
        MyWebSocketClient client = new MyWebSocketClient( new URI("ws://localhost:8012/websocket/LOGOFF_NOTICE/USER202203250000001:f63c418f-e702-4658-b9b7-c45e99bc7c26"));
        Clients.connect(client);
    }
}

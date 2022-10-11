package com.springcloud.study.websocket.bean;

import lombok.extern.slf4j.Slf4j;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * 类 描 述: WebSocket客户端
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
@Slf4j
public class MyWebSocketClient extends WebSocketClient {


    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake arg0) {
        log.info("------ MyWebSocket onOpen ------");
    }

    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        log.info("------ MyWebSocket onClose ------");
    }

    @Override
    public void onError(Exception arg0) {
        log.info("------ MyWebSocket onError ------");
    }

    @Override
    public void onMessage(String arg0) {
        log.info("-------- 接收到服务端数据： " + arg0 + "--------");
    }
}

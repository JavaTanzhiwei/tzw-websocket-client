package com.springcloud.study.websocket.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 类 描 述: WEB_SOCKET消息模式
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
@Data
public class WebSocketMsgCommand implements Serializable {

    private static final long serialVersionUID = -270238631547680821L;

    /**
     * 消息内容
     */
    String msg;

    /**
     * 消息命令:
     * NOTICE 通知,普通的返回消息
     * FORWARD 转发命令
     */
    String command;

    /**
     * 命令的消息类型：默认是发送的同类型
     */
    String type;

    /**
     * 发送的对象:
     * 1.ALL 发送给全部
     * 2.DEP_XX 发送给某个部门
     * 3.ROLE_XX 发送给某个角色
     * 4.USER1,USER2,USER3,...,USERN  发送给某些人
     */
    String target;

    /**
     * 转发内容
     */
    String forwardMsg;
}

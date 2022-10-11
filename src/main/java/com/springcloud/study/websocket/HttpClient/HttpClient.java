package com.springcloud.study.websocket.HttpClient;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.springcloud.study.websocket.bean.WebSocketBean;
import com.springcloud.study.websocket.bean.WebSocketMsgCommand;

/**
 * 类 描 述: HttpClient工具类
 * 作   者: 谭志伟
 * 时   间: 2022/10/11  18:42
 */
public class HttpClient {
    /**
     * 方法描述: 给某些人发送
     * 作   者: 史 云
     * 时   间: 2022年12月30日 16:58:00
     */
    private static void sendToUser(){
        WebSocketBean msgBean = new WebSocketBean();

        WebSocketMsgCommand command = new WebSocketMsgCommand();
        command.setCommand("FORWARD");
        command.setType("LOGOFF_NOTICE");
        command.setTarget("1,");
        command.setForwardMsg("我已经发送了下线通知。。。。。。。。");

        msgBean.setMsg(JSONUtil.toJsonStr(command));
        String post = HttpUtil.post("http://localhost:8005/msg/sendWebSocket/", JSONUtil.toJsonStr(msgBean));
        System.out.println(post);
    }

    /**
     * 方法描述: 给所有在线人员发送
     * 作   者: 史 云
     * 时   间: 2022年12月30日 16:58:00
     */
    private static void sendToAll(){
        WebSocketBean msgBean = new WebSocketBean();

        WebSocketMsgCommand command = new WebSocketMsgCommand();
        command.setCommand("FORWARD");
        command.setType("LOGOFF_NOTICE");
        command.setTarget("ALL");
        command.setForwardMsg("我已经发送了下线通知。。。。。。。。");

        msgBean.setMsg(JSONUtil.toJsonStr(command));
        String post = HttpUtil.post("http://localhost:8005/msg/sendWebSocket/", JSONUtil.toJsonStr(msgBean));
        System.out.println(post);
    }

    /**
     * 方法描述: 给某个部门发送
     * 作   者: 史 云
     * 时   间: 2022年12月30日 17:01:00
     */
    private static void sendToDep(){
        WebSocketBean msgBean = new WebSocketBean();

        WebSocketMsgCommand command = new WebSocketMsgCommand();
        command.setCommand("FORWARD");
        command.setType("LOGOFF_NOTICE");
        command.setTarget("DEP_490");
        command.setForwardMsg("我已经发送了下线通知。。。。。。。。");

        msgBean.setMsg(JSONUtil.toJsonStr(command));
        String post = HttpUtil.post("http://localhost:8005/msg/sendWebSocket/", JSONUtil.toJsonStr(msgBean));
        System.out.println(post);
    }

    /**
     * 方法描述: 给某个角色发送消息
     * 作   者: 史 云
     * 时   间: 2022年12月30日 17:03:00
     */
    private static void sendToRole(){
        WebSocketBean msgBean = new WebSocketBean();

        WebSocketMsgCommand command = new WebSocketMsgCommand();
        command.setCommand("FORWARD");
        command.setType("LOGOFF_NOTICE");
        command.setTarget("ROLE_ROLE202112150000002");
        command.setForwardMsg("我已经发送了下线通知。。。。。。。。");

        msgBean.setMsg(JSONUtil.toJsonStr(command));
        String post = HttpUtil.post("http://localhost:8005/msg/sendWebSocket/", JSONUtil.toJsonStr(msgBean));
        System.out.println(post);
    }

}

package com.gwideal.jyjapp.nettytcp;

import com.gwideal.jyjapp.nettytcp.client.TransClient;
import com.gwideal.jyjapp.nettytcp.server.TransServer;
import com.gwideal.jyjapp.nettytcp.config.NettyTcpConfig;

public class NettyTcpApp {

    public static void start(NettyTcpConfig nettyTcpConfig) {
        System.out.println(nettyTcpConfig);
        TransServer.instance().start(nettyTcpConfig.getServer().getPort());
        TransClient.instance().start(nettyTcpConfig.getClient().getServerIp(), nettyTcpConfig.getClient().getServerPort());
        TransClient.instance().readCmd();
    }
}
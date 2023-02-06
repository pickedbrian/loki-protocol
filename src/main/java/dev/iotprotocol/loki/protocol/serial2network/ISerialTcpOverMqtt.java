package dev.iotprotocol.loki.protocol.serial2network;

import com.sun.jna.Library;

public interface ISerialTcpOverMqtt extends Library {




    boolean Init(String host, int port, int timeOut, String clientId, String username, String password);



}

package dev.iotprotocol.loki.protocol.serial2network;

import com.sun.jna.Native;
import dev.iotprotocol.loki.protocol.serial2network.config.SerialTcpOverMqttConfig;


public class SerialTcpOverMqtt {

    public ISerialTcpOverMqtt initialize(SerialTcpOverMqttConfig config) {
        String os = System.getProperty("os.name").toLowerCase();
        ISerialTcpOverMqtt instance;
        if (os.contains("windows")) {
            instance = (ISerialTcpOverMqtt) Native.loadLibrary("serialMqtt.dll", ISerialTcpOverMqtt.class);
        } else {
            instance = (ISerialTcpOverMqtt) Native.loadLibrary("serialMqtt.so", ISerialTcpOverMqtt.class);
        }
        if (null != instance){
            instance.Init(config.getHostIp(), config.getHostPort(), config.getTimeout(), config.getMqttClientId(), config.getMqttUserName(), config.getMqttPassWord());
            return instance;
        }else {
            throw new RuntimeException("initialize Error");
        }
    }



}

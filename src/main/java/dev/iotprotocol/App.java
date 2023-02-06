//package dev.iotprotocol;
//
//
//import dev.iotprotocol.loki.protocol.serial2network.ISerialTcpOverMqtt;
//import dev.iotprotocol.loki.protocol.serial2network.SerialTcpOverMqtt;
//import dev.iotprotocol.loki.protocol.serial2network.config.SerialTcpOverMqttConfig;
//
//public class App {
//
//    public static void main(String[] args) {
//        SerialTcpOverMqttConfig config = new SerialTcpOverMqttConfig();
//        SerialTcpOverMqtt handel = new SerialTcpOverMqtt();
//        config.setHostIp("39.106.155.249");
//        config.setHostPort(1883);
//        config.setTimeout(3000);
//        config.setMqttClientId("33333213");
//        config.setTimeout(3000);
//        config.setTimeout(3000);
//        ISerialTcpOverMqtt initialize = handel.initialize(config);
//        System.out.println(1);
//    }
//
//}

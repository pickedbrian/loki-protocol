package dev.iotprotocol.loki.protocol.serial2network.config;

public class SerialTcpOverMqttConfig {


    private String hostIp;

    private Integer hostPort;

    private String mqttUserName;

    private String mqttPassWord;

    private String mqttClientId;

    private int timeout;

    private int keepalive;

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public Integer getHostPort() {
        return hostPort;
    }

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    public String getMqttUserName() {
        return mqttUserName;
    }

    public void setMqttUserName(String mqttUserName) {
        this.mqttUserName = mqttUserName;
    }

    public String getMqttPassWord() {
        return mqttPassWord;
    }

    public void setMqttPassWord(String mqttPassWord) {
        this.mqttPassWord = mqttPassWord;
    }

    public String getMqttClientId() {
        return mqttClientId;
    }

    public void setMqttClientId(String mqttClientId) {
        this.mqttClientId = mqttClientId;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(int keepalive) {
        this.keepalive = keepalive;
    }
}

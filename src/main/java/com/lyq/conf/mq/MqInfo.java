package com.lyq.conf.mq;


import lombok.Data;

@Data
public class MqInfo {

     /**
     *  交换机
     */
    private String exchange;
    /**
     *  路由key
     */
    private String routingKey;

    @Override
    public String toString() {
        return "MqProperty{" +
                "exchange='" + exchange + '\'' +
                ", routingKey='" + routingKey + '\'' +
                '}';
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }
}

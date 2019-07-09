package com.imoc.luckymoney;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author Apollo
 * @Date 2019/5/24 16:13
 * @Descreiption
 */
@Entity
//@Component
public class Luckmoney {

    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;

    //发送方
    private String producer;

    //接收方
    private String consumer;

    public Luckmoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}

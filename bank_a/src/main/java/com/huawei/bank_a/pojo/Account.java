package com.huawei.bank_a.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Integer id;
    private Integer money;
    private String user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

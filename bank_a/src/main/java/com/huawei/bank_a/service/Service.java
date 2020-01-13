package com.huawei.bank_a.service;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.huawei.bank_a.component.BankBClient;
import com.huawei.bank_a.mapper.AccountDao;
import com.huawei.bank_a.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author shen
 * @Date 2019/2/26 17:52
 **/
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    AccountDao accountDao;

    @Autowired
    BankBClient bankBClient;

    @LcnTransaction
    public String start(int money) {
        //先增加
    	String user = "jacob";
        String state = bankBClient.addMoney(money,user);
        int res = 0;
        //后更新
        if ("success".equals(state)){
            Account account =  new Account();
            account.setMoney(money);
            account.setUser(user);
            res = accountDao.update(account);
            throw new RuntimeException("error runtime");
        }
        return res>0?"success":"error";
    }
}

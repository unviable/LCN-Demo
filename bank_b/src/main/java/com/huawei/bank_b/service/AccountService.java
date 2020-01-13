package com.huawei.bank_b.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.huawei.bank_b.mapper.AccountMapper;
import com.huawei.bank_b.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    @LcnTransaction
    public String addMoney(int money, String user) {
        Account account = new Account();
        account.setMoney(money);
        account.setUser(user);
        int res =  accountMapper.update(account);
        return res>0?"success":"error";
    }

}

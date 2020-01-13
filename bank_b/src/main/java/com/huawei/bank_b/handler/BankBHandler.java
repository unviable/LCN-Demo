package com.huawei.bank_b.handler;

import com.huawei.bank_b.pojo.Account;
import com.huawei.bank_b.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@RestController
public class BankBHandler {
    @Autowired
    private AccountService service;

    @GetMapping("/add_money")
    public String addMoney(@RequestParam("money") int money,
                           @RequestParam("user")String user){
        return service.addMoney(money,user);
    }
}

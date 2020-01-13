package com.huawei.bank_a.component;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@FeignClient(name = "bank-b")
public interface BankBClient {

    @GetMapping("/add_money")
    String addMoney(@RequestParam("money") int money,
                    @RequestParam("user") String user);
}

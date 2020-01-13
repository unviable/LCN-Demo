package com.huawei.bank_a.handler;

import com.huawei.bank_a.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/start")
    public String start(@RequestParam("money") int money){
        return service.start(money);
    }
}

package com.huawei.bank_b;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDistributedTransaction
public class BankBApplication {

    public static void main(String[] args) {

        SpringApplication.run(BankBApplication.class, args);
    }

}

package com.huawei.bank_a;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.huawei.bank_a.mapper")
@EnableEurekaClient
@EnableFeignClients
@EnableDistributedTransaction
public class BankAApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAApplication.class, args);
    }

}

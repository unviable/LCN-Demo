package com.huawei.bank_b.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Integer id;
    private Integer money;
    private String user;
}

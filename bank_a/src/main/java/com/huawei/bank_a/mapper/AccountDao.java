package com.huawei.bank_a.mapper;

import com.huawei.bank_a.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Mapper
public interface AccountDao {

    @Update("update bank_a set money = money-#{money} where user=#{user}")
    int update(Account account);
}

package com.huawei.bank_b.mapper;

import com.huawei.bank_b.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Mapper
public interface AccountMapper {
    @Update("update bank_b set money = money+#{money} where user =#{user}")
    int update(Account account);
}

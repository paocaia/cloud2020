package com.atguigu.springcloud.alibaba.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;
/**
 * @author wsk
 * @date 2020/3/25 22:05
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
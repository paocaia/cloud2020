package com.atguigu.springcloud.alibaba.dao;
import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @author wsk
 * @date 2020/3/25 20:41
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void createOrder(Order order);

    //2 修改订单状态 从0改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
package com.atguigu.springcloud.alibaba.service;
/**
 * @author wsk
 * @date 2020/3/25 21:51
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}

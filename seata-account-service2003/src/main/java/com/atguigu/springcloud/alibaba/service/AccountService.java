package com.atguigu.springcloud.alibaba.service;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;
/**
 * @author wsk
 * @date 2020/3/25 22:09
 */
public interface AccountService {
    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}

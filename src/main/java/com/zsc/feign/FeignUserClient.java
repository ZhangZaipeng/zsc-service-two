package com.zsc.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/2/15.
 */
// 引入熔断 fallback = FeignFailBack.class
// @FeignClient(name = "zsc-service-one", fallback = FeignFailBack.class)
// 默认配置
@FeignClient(name = "zsc-service-one")
public interface FeignUserClient {
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    User getUserById (@RequestParam("id") String id);
}

package com.zsc.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/2/15.
 */
// 引入熔断 fallback = FeignFailBack.class
// @FeignClient(name = "zsc-service-one", fallback = FeignFailBack.class)
@FeignClient(name = "zsc-service-one")
public interface FeignUserClient {
    @RequestMapping(value = "/getUserById")
    User getUserById (@RequestParam String id);
}

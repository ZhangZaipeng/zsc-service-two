package com.zsc.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by ZhangZaipeng on 2018/2/25 0025.
 */
// 原生Feign 写法
// 自定义配置
@FeignClient(name = "zsc-service-one", url="http://zsc-service-one:9005",configuration = FeignClientConfiguration.class)
public interface FeignNativeUserClient {

    @RequestLine("GET /getUserById")
    User getUserById (@Param("id") String id);

}

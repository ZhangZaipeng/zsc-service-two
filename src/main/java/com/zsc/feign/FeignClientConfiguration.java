package com.zsc.feign;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;

/**
 * Created by ZhangZaipeng on 2018/2/25 0025.
 */
public class FeignClientConfiguration {

    @Bean
    public Contract feignContract(ConversionService conversionService){
        return new feign.Contract.Default();
    }
}

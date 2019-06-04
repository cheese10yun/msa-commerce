package com.yun.commerce.infra.order;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "api-gateway")
@RibbonClient(name = "order-service")
public interface OrderClient {

}

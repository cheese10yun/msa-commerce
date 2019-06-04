package com.commerce.member.infra.order;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "api-gateway")
@RibbonClient(name = "order-service")
public interface OrderClient {

}

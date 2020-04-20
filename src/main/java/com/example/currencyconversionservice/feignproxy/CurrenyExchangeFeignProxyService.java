package com.example.currencyconversionservice.feignproxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.currencyconversionservice.bean.CurrencyConversionBean;

@Repository
/* @FeignClient(name="currency-exchange-service",url="localhost:8010") */
@FeignClient(name="zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrenyExchangeFeignProxyService {
	
	@GetMapping("/currency-exchange-service/currency-exchange-service/from/{from}/to/{to}")
	public ResponseEntity<CurrencyConversionBean> fetchCurrentBean(
			@PathVariable String from, @PathVariable String to);

}

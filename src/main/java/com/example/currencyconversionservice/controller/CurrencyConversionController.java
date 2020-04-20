package com.example.currencyconversionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyconversionservice.bean.CurrencyConversionBean;
import com.example.currencyconversionservice.feignproxy.CurrenyExchangeFeignProxyService;

@RestController
@RequestMapping("/currency-conversion-service")
public class CurrencyConversionController {
	
	@Autowired
	private CurrenyExchangeFeignProxyService currenyExchangeFeignProxyService;
	
	@GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable Integer quantity) {
		CurrencyConversionBean conversionBean = currenyExchangeFeignProxyService.fetchCurrentBean(from, to).getBody();
		conversionBean.setQuantity(quantity);
		conversionBean.setTotalValue(conversionBean.getQuantity()*conversionBean.getExchangeValue());
		return conversionBean;
	}

}

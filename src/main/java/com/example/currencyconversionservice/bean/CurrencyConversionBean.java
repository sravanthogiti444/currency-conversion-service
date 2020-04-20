package com.example.currencyconversionservice.bean;

public class CurrencyConversionBean {

	private String from;
	private String to;
	private int exchangeValue;
	private int quantity;
	private int totalValue;
	private int port;
	
	
	public CurrencyConversionBean() {
		super();
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyConversionBean(String from, String to, int exchangeValue, int quantity, int totalValue) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
		this.quantity = quantity;
		this.totalValue = totalValue;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getExchangeValue() {
		return exchangeValue;
	}

	public void setExchangeValue(int exchangeValue) {
		this.exchangeValue = exchangeValue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	
	
}

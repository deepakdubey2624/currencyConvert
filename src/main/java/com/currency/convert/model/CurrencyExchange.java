package com.currency.convert.model;

import java.util.Map;

/**
 * @author Deepak dwivedi
 *
 */
public class CurrencyExchange {

	private String disclaimer;
	private String license;
	private Long timestamp;
	private String base;
	private Map<String, Double> rates;

	public String getDiscalimer() {
		return disclaimer;
	}

	public void setDiscalimer(String discalimer) {
		this.disclaimer = discalimer;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Map<String, Double> getRates() {
		return rates;
	}

	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}

}

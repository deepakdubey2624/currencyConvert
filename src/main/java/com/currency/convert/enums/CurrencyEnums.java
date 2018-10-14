package com.currency.convert.enums;

/**
 * 
 * @author Deepak dwivedi enum constants
 *
 */
public enum CurrencyEnums {
	EUR("EUR"), INR("INR"), USD("USD"), AUD("AUD"), JPA("JPY");

	String description;

	CurrencyEnums(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}

package com.currency.convert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.convert.model.CurrencyRates;

/**
 * 
 * @author Deepak dwivedi Repository
 *
 */
public interface CurrencyRatesRepository extends JpaRepository<CurrencyRates, Integer> {

}

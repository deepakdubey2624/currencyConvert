package com.currency.convert.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.currency.convert.model.Queries;

/**
 * @author Deepak dwivedi service
 *
 */
public interface QueriesService {

	void saveQuery(String username, Date queriedDate, String currencyFrom, String currencyTo, BigDecimal rate,
			String result, BigDecimal amount);

	void saveQuery(Queries queries);

	List<Queries> listOfQueries(String username);

}

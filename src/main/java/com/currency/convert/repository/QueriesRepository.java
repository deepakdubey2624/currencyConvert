package com.currency.convert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.convert.model.Queries;

/**
 * @author Deepak dwivedi repository
 *
 */
public interface QueriesRepository extends QueriesCustomRepository, JpaRepository<Queries, Long> {

}

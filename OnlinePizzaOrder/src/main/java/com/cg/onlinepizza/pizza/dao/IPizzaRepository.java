package com.cg.onlinepizza.pizza.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cg.onlinepizza.exceptions.InvalidMinCostException;
import com.cg.onlinepizza.exceptions.PizzaIdNotFoundException;
import com.cg.onlinepizza.pizza.dto.Pizza;

public interface IPizzaRepository extends CrudRepository<Pizza, Integer>{
	@Query(value="select * from pizza where pizza_cost between :minCost and :maxCost", nativeQuery = true)
	List<Pizza> getAllbetween(@Param("minCost")double minCost,@Param("maxCost") double maxCost);



}

package com.cg.onlinepizza.order.dao;


import org.springframework.data.repository.CrudRepository;

import com.cg.onlinepizza.order.dto.PizzaOrder;


public interface IPizzaOrderRepository extends CrudRepository<PizzaOrder, Integer> {

}

package com.educandoweb.SpringBootJPA.repositories;

import com.educandoweb.SpringBootJPA.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.educandoweb.SpringBootJPA.repositories;

import com.educandoweb.SpringBootJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

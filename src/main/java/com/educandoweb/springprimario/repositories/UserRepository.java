package com.educandoweb.springprimario.repositories;

import com.educandoweb.springprimario.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

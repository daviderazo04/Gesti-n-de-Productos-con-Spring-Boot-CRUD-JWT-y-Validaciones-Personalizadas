package com.david.springboot.app.springboot_crud.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.david.springboot.app.springboot_crud.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    Boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}

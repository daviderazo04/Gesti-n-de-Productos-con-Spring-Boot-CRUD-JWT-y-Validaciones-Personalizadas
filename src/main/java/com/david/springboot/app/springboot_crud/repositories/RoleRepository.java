package com.david.springboot.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import com.david.springboot.app.springboot_crud.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);
}

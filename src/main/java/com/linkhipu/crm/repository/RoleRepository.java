package com.linkhipu.crm.repository;

import java.util.Optional;

import com.linkhipu.crm.models.ERole;
import com.linkhipu.crm.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
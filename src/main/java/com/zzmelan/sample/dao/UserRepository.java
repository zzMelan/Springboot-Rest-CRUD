package com.zzmelan.sample.dao;

import com.zzmelan.sample.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * UserRepository
 */
@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Integer>{

    
}
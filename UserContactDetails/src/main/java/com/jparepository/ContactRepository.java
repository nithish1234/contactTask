package com.jparepository;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface ContactRepository extends CrudRepository<User , String> {

}

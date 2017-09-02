package com.jparepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public interface ContactRepository extends CrudRepository<User , String> {

}

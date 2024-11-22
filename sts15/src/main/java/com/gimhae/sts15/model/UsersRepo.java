package com.gimhae.sts15.model;

import org.springframework.data.repository.CrudRepository;

import com.gimhae.sts15.model.entity.Users;

public interface UsersRepo extends CrudRepository<Users, Integer> {

}

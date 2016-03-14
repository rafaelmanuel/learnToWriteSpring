package com.pdk.rest.core;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pdk.data.entity.User;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface HomeRepository extends MongoRepository<User, String>{
	List<User> findByFirstName(@Param("firstName")String firstName);
}

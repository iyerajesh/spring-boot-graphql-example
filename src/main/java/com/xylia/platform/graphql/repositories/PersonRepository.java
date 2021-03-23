package com.xylia.platform.graphql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.xylia.platform.graphql.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}

package com.xylia.platform.graphql.resolvers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.xylia.platform.graphql.exceptions.PersonNotFoundException;
import com.xylia.platform.graphql.model.Person;
import com.xylia.platform.graphql.repositories.PersonRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PersonQuery implements GraphQLQueryResolver {

    private final PersonRepository repo;

    public Person person(Long id) {
        return repo.findById(id).orElseThrow(() -> new PersonNotFoundException("person not found", id));
    }

    public Iterable<Person> allPeople() {
        return repo.findAll();
    }

}

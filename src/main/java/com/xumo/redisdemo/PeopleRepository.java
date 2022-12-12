package com.xumo.redisdemo;

import com.xumo.redisdemo.model.People;
import com.xumo.redisdemo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<People, String> {
}

package com.xumo.redisdemo;

import com.xumo.redisdemo.model.Address;
import com.xumo.redisdemo.model.People;
import com.xumo.redisdemo.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class PeopleControllerTest {

    @Autowired
    PeopleController peopleController;

    @Test
    void addPersonTest() {
        Person p = peopleController.addPerson("J1", "A1");
        Assertions.assertNotNull(p);
    }

    @Test
    void readPersonTest() {

        Person p = peopleController.getPerson("J1");
        Assertions.assertNotNull(p);

    }

    @Test
    void addPeopleTest() {
        Address a = new Address("PeopleAddress1");
        Person p = new Person("PeoplePerson1", Arrays.asList(a));

        People people = peopleController.addPeople(p);
        Assertions.assertNotNull(people);
    }


}
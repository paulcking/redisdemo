package com.xumo.redisdemo;

import com.xumo.redisdemo.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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


}
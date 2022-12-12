package com.xumo.redisdemo;

import com.xumo.redisdemo.model.Address;
import com.xumo.redisdemo.model.People;
import com.xumo.redisdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class PeopleController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PeopleRepository peopleRepository;

    public Person getPerson(String name) {
        Optional<Person> p = personRepository.findById(name);

        return p.orElseThrow();
    }

    public Person addPerson(String name, String address) {
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address(address));
        Person p = new Person(name, addressList);

        Person pSaved = personRepository.save(p);

        return pSaved;
    }

    public People addPeople(Person person) {
        Map<Address, List<Person>> residents = new HashMap<>();
        residents.put(person.addressList().get(0), Arrays.asList(person));

        People people = new People("people", residents);

        People saved = peopleRepository.save(people);

        return saved;
    }
}

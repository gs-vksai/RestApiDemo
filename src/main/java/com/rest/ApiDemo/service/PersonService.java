package com.rest.ApiDemo.service;

import com.rest.ApiDemo.model.Person;
import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.stream.Stream;
import java.util.ArrayList;
@Service
public class PersonService
{
    ArrayList<Person> persons = new ArrayList<Person>();
    public PersonService() {
        Person p = new Person();
        p.setId("1");
        p.setAge(21);
        p.setFirstName("vikash");
        p.setLastName("sai");
        persons.add(p);

        p = new Person();
        p.setId("2");
        p.setAge(25);
        p.setFirstName("sai");
        p.setLastName("teja");
        persons.add(p);
    }
    public Person getPerson(String id) {
        for(Person person:persons) {
            if(person.getId().equalsIgnoreCase(id)) return person;
        }
        return null;
    }
    public ArrayList<Person> getAll() {
        return persons;
    }
}

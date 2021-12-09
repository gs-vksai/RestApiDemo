package com.rest.ApiDemo.controller;

import com.rest.ApiDemo.model.Person;
import com.rest.ApiDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/persons")

public class PersonController
{
    @Autowired
    PersonService ps;

    @RequestMapping("/all")
    public ArrayList<Person> getAll() {
        return ps.getAll();
    }

    @RequestMapping("{id}")
    public Person getPerson(@PathVariable("id") String id) {
        return ps.getPerson(id);
    }
}

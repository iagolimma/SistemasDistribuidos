package br.com.projRedis.controller;

import br.com.projRedis.model.Person;
import br.com.projRedis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/api/person")
    public List<Person> findAll(){
        return personService.findAll();
    }

    @PostMapping("/api/person")
    public void save(Person person){
        personService.save(person);
    }

    @GetMapping("/api/person/{id}")
    @Cacheable("person")
    public Person findById(@PathVariable("id") String id){
        System.out.println("Find Information.. " + id);
        return personService.findById(id);
    }
}

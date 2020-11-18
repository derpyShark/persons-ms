package kpi.trspo.personsms.service;

import javassist.NotFoundException;
import kpi.trspo.personsms.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonService {
    List<Person> getAll();
    Person getById(UUID personId) throws NotFoundException;
    Person create(Person personObject);
    Person update(UUID personId, Person personDetails) throws NotFoundException;
    void delete(UUID personId) throws NotFoundException;
}

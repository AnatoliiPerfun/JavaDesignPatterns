package Patterns.AdditionalPatterns.MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:09 PM
 */

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}

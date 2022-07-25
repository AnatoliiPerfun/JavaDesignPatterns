package Patterns.AdditionalPatterns.MVC;

import java.util.List;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:08 PM
 */
public interface PersonService {
    void createPerson(Person person);
    List<Person> getAllPersons();
}

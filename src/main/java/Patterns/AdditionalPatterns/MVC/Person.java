package Patterns.AdditionalPatterns.MVC;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 3:59 PM
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age = 0;

}

package Patterns.AdditionalPatterns.MVC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:10 PM
 */
@Repository
public interface PersonRepository  extends JpaRepository<Person, Long> {
}

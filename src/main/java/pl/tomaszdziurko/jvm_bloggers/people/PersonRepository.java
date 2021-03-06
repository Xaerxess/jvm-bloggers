package pl.tomaszdziurko.jvm_bloggers.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByRssIgnoreCase(String rss);
    Optional<Person> findByNameIgnoreCase(String name);
}

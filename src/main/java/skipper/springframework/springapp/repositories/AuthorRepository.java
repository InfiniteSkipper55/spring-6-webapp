package skipper.springframework.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import skipper.springframework.springapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

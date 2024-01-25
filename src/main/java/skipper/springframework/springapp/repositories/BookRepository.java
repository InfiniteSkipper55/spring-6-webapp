package skipper.springframework.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import skipper.springframework.springapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

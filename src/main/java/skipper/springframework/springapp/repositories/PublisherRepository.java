package skipper.springframework.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import skipper.springframework.springapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

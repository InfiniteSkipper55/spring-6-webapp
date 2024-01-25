package skipper.springframework.springapp.service;

import skipper.springframework.springapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}

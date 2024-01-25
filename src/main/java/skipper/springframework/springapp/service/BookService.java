package skipper.springframework.springapp.service;

import skipper.springframework.springapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}

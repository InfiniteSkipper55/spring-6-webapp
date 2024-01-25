package skipper.springframework.springapp.service;

import org.springframework.stereotype.Service;
import skipper.springframework.springapp.domain.Book;
import skipper.springframework.springapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

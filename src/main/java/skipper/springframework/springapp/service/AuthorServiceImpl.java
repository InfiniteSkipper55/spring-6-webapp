package skipper.springframework.springapp.service;

import org.springframework.stereotype.Service;
import skipper.springframework.springapp.domain.Author;
import skipper.springframework.springapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}

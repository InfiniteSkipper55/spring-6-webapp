package skipper.springframework.springapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import skipper.springframework.springapp.domain.Author;
import skipper.springframework.springapp.domain.Book;
import skipper.springframework.springapp.domain.Publisher;
import skipper.springframework.springapp.repositories.AuthorRepository;
import skipper.springframework.springapp.repositories.BookRepository;
import skipper.springframework.springapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author stephen = new Author();
        stephen.setFirstName("Stephen");
        stephen.setLastName("Hawkins");

        Book abhot = new Book();
        abhot.setTitle("A Brief History of Time");
        abhot.setIsbn("23432");
        abhot.setPages(256);

        Author stephenSaved = authorRepository.save(stephen);
        Book abhotSaved = bookRepository.save(abhot);

        Author brian = new Author();
        brian.setFirstName("Brian");
        brian.setLastName("Weiss");

        Book mlmm = new Book();
        mlmm.setTitle("Many Lives, Many Masters");
        mlmm.setIsbn("978-0-7499-1378-6");
        mlmm.setPages(210);

        Author brianSaved = authorRepository.save(brian);
        Book mlmmSaved = bookRepository.save(mlmm);

        stephenSaved.getBooks().add(abhotSaved);
        brianSaved.getBooks().add(mlmmSaved);
        abhotSaved.getAuthors().add(stephenSaved);
        mlmmSaved.getAuthors().add(brianSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Idli Dosi");
        publisher.setAddress("Macchi Talao, Dockyard Lane, Prawns Corner ke saamne");
        publisher.setCity("Mapusa");
        publisher.setState("Goa");
        publisher.setZip("48787");
        Publisher savedPublisher = publisherRepository.save(publisher);

        abhotSaved.setPublisher(savedPublisher);
        mlmmSaved.setPublisher(savedPublisher);

        authorRepository.save(stephenSaved);
        authorRepository.save(brianSaved);
        bookRepository.save(abhotSaved);
        bookRepository.save(mlmmSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());



        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}

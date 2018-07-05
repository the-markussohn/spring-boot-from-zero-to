package lt.markussohn.webappdemo.bootstrap;

import lt.markussohn.webappdemo.model.Author;
import lt.markussohn.webappdemo.model.Book;
import lt.markussohn.webappdemo.model.Publisher;
import lt.markussohn.webappdemo.repository.AuthorRepository;
import lt.markussohn.webappdemo.repository.BookRepository;
import lt.markussohn.webappdemo.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author the-markussohn
 * 2018-07-05.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author testAuthorOne = new Author("testName", "testLastName");
        Book testBookOne = new Book("testTitle");
        Publisher testPub = new Publisher("testPublisher", "testAddress");
        publisherRepository.save(testPub);

        testBookOne.setPublisher(testPub);
        testAuthorOne.getBooks().add(testBookOne);

        bookRepository.save(testBookOne);
        authorRepository.save(testAuthorOne);
    }
}

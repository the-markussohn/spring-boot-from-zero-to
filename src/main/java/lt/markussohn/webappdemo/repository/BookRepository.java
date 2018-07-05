package lt.markussohn.webappdemo.repository;

import lt.markussohn.webappdemo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author the-markussohn
 * 2018-07-05.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

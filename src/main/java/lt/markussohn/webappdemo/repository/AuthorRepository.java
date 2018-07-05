package lt.markussohn.webappdemo.repository;

import lt.markussohn.webappdemo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author the-markussohn
 * 2018-07-05.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

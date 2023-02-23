package cat.springfamework.spring6webapplication.repositories;

import cat.springfamework.spring6webapplication.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book , Long> {
}

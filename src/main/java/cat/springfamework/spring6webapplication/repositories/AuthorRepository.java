package cat.springfamework.spring6webapplication.repositories;

import cat.springfamework.spring6webapplication.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

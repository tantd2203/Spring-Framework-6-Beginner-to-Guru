package cat.springfamework.spring6webapplication.repositories;

import cat.springfamework.spring6webapplication.entity.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher , Long> {
}

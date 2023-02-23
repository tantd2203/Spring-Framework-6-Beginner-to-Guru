package cat.springfamework.spring6webapplication.service;

import cat.springfamework.spring6webapplication.entity.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}

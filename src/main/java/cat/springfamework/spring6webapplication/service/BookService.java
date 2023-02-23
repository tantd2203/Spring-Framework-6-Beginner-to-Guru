package cat.springfamework.spring6webapplication.service;

import cat.springfamework.spring6webapplication.entity.Book;

public interface BookService  {

    Iterable<Book> findAll();
}

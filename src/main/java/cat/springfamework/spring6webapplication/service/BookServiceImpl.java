package cat.springfamework.spring6webapplication.service;

import cat.springfamework.spring6webapplication.entity.Book;
import cat.springfamework.spring6webapplication.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    public final  BookRepository bookRepository;
    public BookServiceImpl (BookRepository bookRepository){
       this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

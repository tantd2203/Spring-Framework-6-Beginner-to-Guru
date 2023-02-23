package cat.springfamework.spring6webapplication.service;

import cat.springfamework.spring6webapplication.entity.Author;
import cat.springfamework.spring6webapplication.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    AuthorRepository authorRepository;
    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}

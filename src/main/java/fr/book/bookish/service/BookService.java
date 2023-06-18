package fr.book.bookish.service;


import fr.book.bookish.Repository.BookRepository;
import fr.book.bookish.datamodel.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public void save(Book b) {
        bRepo.save(b);
    }

}

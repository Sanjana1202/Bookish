package fr.book.bookish.Repository;


import fr.book.bookish.datamodel.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//defining Book repository to manage CRUD operations
//@Repository is used to declare a class as DAO
//the class extends to JpaRepository which implements all CRUD operations
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

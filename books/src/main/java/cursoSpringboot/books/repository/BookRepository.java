package cursoSpringboot.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cursoSpringboot.books.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
package cursoSpringboot.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cursoSpringboot.books.model.Book;
import cursoSpringboot.books.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public Optional<Book> findById(long id) {
		return repository.findById(id);
	}
	
	public boolean exist(long id) {
		return repository.existsById(id);
	}

	public List<Book> findAll() {
		return repository.findAll();
	}

	public void save(Book book) {
		repository.save(book);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
}

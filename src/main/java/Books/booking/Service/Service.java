package Books.booking.Service;

import Books.booking.Model.Books;
import Books.booking.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


@org.springframework.stereotype.Service
public class Service{
    @Autowired
    private BooksRepository booksRepository;

    private final Books books = new Books();

    public Optional<Books> getBooks(String name, int serialNumb){
        Optional<Books> byName = Optional.ofNullable(booksRepository.findByName(name));
        Optional<Books> bySerialNumb = Optional.ofNullable(booksRepository.findBySerialNumb(serialNumb));

        return byName.isPresent() ? byName : bySerialNumb;
    }

    public void createBook(Books book){
        booksRepository.save(book);
    }

    public void deleteBook(Books book){
       book = booksRepository.findByName(books.getName());
       if(booksRepository.existsByBook(book))
           booksRepository.delete(book);
    }
}

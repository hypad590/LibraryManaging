package Books.booking.Service;

import Books.booking.Model.Books;
import Books.booking.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class Service{
    @Autowired
    private BooksRepository booksRepository;

    private final Books books = new Books();

    public Books getBook(String name){
        return booksRepository.findByName(name);
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

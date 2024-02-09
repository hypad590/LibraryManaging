package Books.booking.Repository;

import Books.booking.Model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<Books,String> {
    Books findByName(String name);
    Books findBySerialNumb(int serialNumb);
    boolean existsByBook(Books book);
}

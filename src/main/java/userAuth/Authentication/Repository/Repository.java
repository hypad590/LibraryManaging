package userAuth.Authentication.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import userAuth.Authentication.Model.User;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<User,String> {
    User findByName(String name);
    User findById(Long id);
    boolean existsByName(String name);
}

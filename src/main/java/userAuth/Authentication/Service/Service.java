package userAuth.Authentication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import userAuth.Authentication.Model.User;
import userAuth.Authentication.Repository.Repository;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;
    private final User userCheckIf = new User();

    public void createUser(User user){
        repository.save(user);
    }
    public void deleteUser(User user){
        user = repository.findByName(userCheckIf.getName());
        if(repository.existsByName(user.getName()))
            repository.delete(user);
    }
    public List<User> getUserInfo(String name){
        Optional<User> optionalUser = Optional.ofNullable(repository.findByName(name));
        if(optionalUser.isPresent()){
            return Collections.singletonList(optionalUser.get());
        }else{
            throw new NoSuchElementException();
        }
    }
    public Optional<User> getUser(String name, Long id){
        Optional<User> byName = Optional.ofNullable(repository.findByName(name));
        Optional<User> byId = Optional.ofNullable(repository.findById(id));

        return byName.isPresent() ? byName : byId;

    }

}

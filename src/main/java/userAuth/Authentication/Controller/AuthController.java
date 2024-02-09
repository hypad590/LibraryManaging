package userAuth.Authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import userAuth.Authentication.Model.User;
import userAuth.Authentication.Repository.Repository;
import userAuth.Authentication.Service.Service;

@RestController
public class AuthController {
    @Autowired
    private Repository repository;
    private final Service service = new Service();

    @PostMapping("/usersPage")
    public ModelAndView usersPage(@RequestBody String requested, @RequestBody Long id, User user){
        service.setUserInfo(user,requested,id);
        service.saveUser(user);
        return new ModelAndView("redirect:/");
    }

}

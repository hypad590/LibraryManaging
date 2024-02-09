package userAuth.Authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import userAuth.Authentication.Repository.Repository;

@RestController
public class AuthController {
    @Autowired
    private Repository repository;

    @PostMapping("/usersPage")
    public ModelAndView usersPage(@RequestBody String requested){
        return new ModelAndView("redirect:/");
    }

}

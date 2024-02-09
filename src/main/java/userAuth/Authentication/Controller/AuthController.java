package userAuth.Authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import userAuth.Authentication.Repository.Repository;

@RestController
public class AuthController {
    @Autowired
    private Repository repository;
}

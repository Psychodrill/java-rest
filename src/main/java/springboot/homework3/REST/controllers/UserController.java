package springboot.homework3.REST.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.homework3.REST.domain.User;
import springboot.homework3.REST.services.RegistrationService;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> getAllUsers(){
        return service.getDataProcessingService().getRepository().getUsers();
    }
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){

        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "user added from body!";
    }
}

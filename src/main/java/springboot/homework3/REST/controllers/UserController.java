package springboot.homework3.REST.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/sort")
    public List<User> sortUserByAge(){
        return service.getDataProcessingService().sortUsersByAge(service.getDataProcessingService().getRepository().getUsers());
    }
    @GetMapping("/filter/{age}")
    public List<User>filterUsersByAge(@PathVariable int age){
        return service.getDataProcessingService().sortUsersByAge(service.getDataProcessingService().getRepository().getUsers());
    }
    @GetMapping("/calc")
    public double alculateAverageAge(){
        return service.getDataProcessingService().calculateAverageAge(service.getDataProcessingService().getRepository().getUsers());
    }
}

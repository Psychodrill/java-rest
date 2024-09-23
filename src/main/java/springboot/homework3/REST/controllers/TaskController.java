package springboot.homework3.REST.controllers;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.homework3.REST.domain.User;
import springboot.homework3.REST.services.DataProcessingService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks(){
        List<String> tasks = new ArrayList();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return tasks;
    }
    @GetMapping("/sort")
    public List<User> sortUserByAge(){
        return service.sortUsersByAge(service.getRepository().getUsers());
    }
    @GetMapping("/filter/{age}")
    public List<User>filterUsersByAge(@PathVariable int age){
        return service.sortUsersByAge(service.getRepository().getUsers());
    }
    @GetMapping("/calc")
    public double alculateAverageAge(){
        return service.calculateAverageAge(service.getRepository().getUsers());
    }

}

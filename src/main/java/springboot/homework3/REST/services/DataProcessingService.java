package springboot.homework3.REST.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.homework3.REST.domain.User;
import springboot.homework3.REST.repository.UserRepository;

@Service
public class DataProcessingService {

    @Autowired
    private UserRepository repository;

    public UserRepository getRepository(){
        return repository;
    }

    public List<User> sortUsersByAge(List<User> users){

        return users.stream().sorted(Comparator.comparing(User::getAge))
                            .collect(Collectors.toList());
    }

    public List<User> filterUsersByAge(List<User> users, int age){

        return users.stream().filter(user->user.getAge()>age)
                            .collect(Collectors.toList());
    }

    public double calculateAverageAge(List<User> users){

        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }

    public void addUser(User user){
        repository.getUsers().add(user);
    }

}

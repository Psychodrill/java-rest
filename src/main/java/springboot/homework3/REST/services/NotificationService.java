package springboot.homework3.REST.services;

import org.springframework.stereotype.Service;

import springboot.homework3.REST.domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user){
        System.out.println("A new user has been created: "+user.getName());
    }

}

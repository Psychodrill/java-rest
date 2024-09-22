package springboot.homework3.REST.services;

import springboot.homework3.REST.domain.User;

public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService= notificationService;

    }
    public User createUser(String name, int age, String email){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        notificationService.notifyUser(user);
        return user;
    }
}

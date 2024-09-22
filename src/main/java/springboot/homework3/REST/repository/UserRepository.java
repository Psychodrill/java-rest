package springboot.homework3.REST.repository;

import java.util.*;

import org.springframework.stereotype.Component;

import springboot.homework3.REST.domain.User;

@Component
public class UserRepository {
    public void setUsers(List<User> users){
        this.users=users;
    }
    public List<User> getUsers(){
        return this.users;
    }

    private List<User> users = new ArrayList<User>();
}



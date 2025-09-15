package com.mdg.userService;

import com.mdg.entity.User;
import com.mdg.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    public String getUsername(int id){
        User user= repo.getReferenceById(id);
        return user.getUsername();
    }
}

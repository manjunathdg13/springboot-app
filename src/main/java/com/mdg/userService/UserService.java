package com.mdg.userService;

import com.mdg.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    public String getUsername(int id){

        return "Hello world";
    }
}

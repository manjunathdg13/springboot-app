package com.mdg.api;

import com.mdg.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://react-deploy-kor7.vercel.app")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping("/{id}")
    public String getName(@PathVariable int id){
       return service.getUsername(id);

    }
}

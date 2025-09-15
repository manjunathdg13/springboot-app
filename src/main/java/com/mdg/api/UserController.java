package com.mdg.api;

import com.mdg.dto.Todo;
import com.mdg.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
 @CrossOrigin(origins = "https://react-deploy-kor7.vercel.app")
//    @CrossOrigin(origins = "http://localhost:5174")

public class UserController {
    private final List<Todo> todos = new ArrayList<>();

    public UserController() {
        for (int i = 1; i <= 20; i++) {
            todos.add(new Todo(i, "Todo task number " + i, i % 2 == 0));
        }
    }

    // GET all todos
    // @GetMapping("todos")
    // public List<Todo> getTodos() {
    //     return todos;
    // }

    // GET single todo by id
//
    @Autowired
    UserService service;
    @GetMapping("/{id}")
    public String getName(@PathVariable int id){
       return  todos;

    }
}

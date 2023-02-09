package me.dulanjana.demo.controller;

import me.dulanjana.demo.dto.UserDTO;
import me.dulanjana.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO dto){
        System.out.println(dto);
       return userService.saveUser(dto);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO dto){
        return userService.updateUser(dto);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO dto){
        return userService.deleteUser(dto);
    }
}

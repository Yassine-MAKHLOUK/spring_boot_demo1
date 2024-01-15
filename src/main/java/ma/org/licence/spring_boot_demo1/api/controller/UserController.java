package ma.org.licence.spring_boot_demo1.api.controller;

import ma.org.licence.spring_boot_demo1.api.model.User;
import ma.org.licence.spring_boot_demo1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional user = userService.getUser(id);
        if (user.isPresent()){
            return (User) user.get();
        }
        return null;
    }
    @GetMapping("/userByName")
    public User getUserByName(@RequestParam String name){
        Optional user = userService.getUserByName(name);
        if (user.isPresent()){
            return (User) user.get();
        }
        return null;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        List users = userService.getUsers();
        if (!users.isEmpty()){
            return users;
        }
        return null;
    }


}

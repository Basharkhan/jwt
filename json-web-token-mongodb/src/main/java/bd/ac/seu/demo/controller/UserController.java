package bd.ac.seu.demo.controller;

import bd.ac.seu.demo.model.GeneralEvent;
import bd.ac.seu.demo.model.SpecialEvent;
import bd.ac.seu.demo.model.User;
import bd.ac.seu.demo.model.UserDto;
import bd.ac.seu.demo.repo.GeneralEventRepository;
import bd.ac.seu.demo.repo.SpecialEventRepository;
import bd.ac.seu.demo.repo.UserRepository;
import bd.ac.seu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    SpecialEventRepository specialEventRepository;

    @Autowired
    GeneralEventRepository generalEventRepository;

    @Autowired
    UserService userService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping("/signup")
    public String createUser(@RequestBody UserDto userDto){
        User user = userRepository.findUserByUserName(userDto.getUserName());
        if(user == null){
            userService.createUser(userDto);
            return "OK";
        } else {
            System.out.println("User already exists");
            return "FAILED";
        }
    }

    @PostMapping("/admin")
    public String createAdmin(@RequestBody UserDto userDto){
        User user = userRepository.findUserByUserName(userDto.getUserName());
        if(user == null){
            userService.createAdmin(userDto);
            return "OK";
        } else {
            System.out.println("Admin already exists");
            return "FAILED";
        }
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/specialevents")
    public List<SpecialEvent> getSpecialEvents(){
        return specialEventRepository.findAll();
    }

    @GetMapping("/generalevents")
    public List<GeneralEvent> getGeneralEvents(){
        return generalEventRepository.findAll();
    }
}

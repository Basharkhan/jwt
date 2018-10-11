package bd.ac.seu.demo.service;

import bd.ac.seu.demo.model.User;
import bd.ac.seu.demo.model.UserDto;


import java.util.List;

public interface UserService {
    void createUser(UserDto user);
    void createAdmin(UserDto user);
    List<User> findAll();
    void delete(String id);
    User findOne(String username);
    User findById(String id);
}

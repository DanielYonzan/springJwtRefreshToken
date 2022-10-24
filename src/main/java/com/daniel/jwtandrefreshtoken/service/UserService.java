package com.daniel.jwtandrefreshtoken.service;

import com.daniel.jwtandrefreshtoken.domain.Role;
import com.daniel.jwtandrefreshtoken.domain.User;

import java.util.List;

/**
 * @author Daniel Tamang
 * @since 10/22/2022
 */
public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

}

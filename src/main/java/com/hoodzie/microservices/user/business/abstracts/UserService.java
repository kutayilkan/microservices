package com.hoodzie.microservices.user.business.abstracts;

import com.hoodzie.microservices.core.exceptions.UserNotFoundException;
import com.hoodzie.microservices.user.entities.dtos.UserDTO;
import java.util.List;

public interface UserService {

    List<UserDTO> getUsers();

    UserDTO getUserById(Long userId);

    UserDTO saveUser(UserDTO user);

    void deleteUserById(Long userId) throws UserNotFoundException;
}

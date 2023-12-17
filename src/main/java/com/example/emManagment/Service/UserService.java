package com.example.emManagment.Service;

import com.example.emManagment.DTO.RequestDTO.UserRequestDTO;
import com.example.emManagment.DTO.ResponseDTO.UserResponseDTO;
import com.example.emManagment.Exception.UserNotFoundException;
import com.example.emManagment.Model.User;
import com.example.emManagment.Repository.UserRepository;
import com.example.emManagment.Transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUserById(Long id) throws Exception {
        Optional<User> op1=userRepository.findById(id);
        if(op1.isEmpty()){
            throw new UserNotFoundException();
        }
        return op1.get();
    }

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user= UserTransformer.UserRequestDTOTOUser(userRequestDTO);
        User savedUser= userRepository.save(user);
        UserResponseDTO userResponseDTO=UserTransformer.UserToUserResponseDTO(user);
        return userResponseDTO;
    }

    public User updateUser(Long id, User user) {
        // Add logic for user updating, validation, and business rules
        user.setId(id);
        User updatedUser=userRepository.save(user);
        return updatedUser;
    }

    public void deleteUser(Long id) {
        // Add logic for user deletion, handle related entities, etc.
        userRepository.deleteById(id);
    }
}

package com.example.emManagment.Transformer;

import com.example.emManagment.DTO.RequestDTO.UserRequestDTO;
import com.example.emManagment.DTO.ResponseDTO.UserResponseDTO;
import com.example.emManagment.Model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserTransformer {
    public static User UserRequestDTOTOUser(UserRequestDTO userRequestDTO){
        User user=new User();
        user.setEmail(userRequestDTO.getEmailId());
        user.setPassword(userRequestDTO.getPassword());
        user.setUsername(userRequestDTO.getUsername());
        return user;
    }
    public static UserResponseDTO UserToUserResponseDTO(User user){
        UserResponseDTO userResponseDTO=new UserResponseDTO();
        userResponseDTO.setMessage("Congrat, You have successfully registered with mailId: "+user.getEmail());
        return userResponseDTO;
    }
}

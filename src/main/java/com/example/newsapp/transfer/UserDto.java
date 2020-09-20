package com.example.newsapp.transfer;

import com.example.newsapp.models.Role;
import com.example.newsapp.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class UserDto {
    private String firstName;
    private Role role;

//    public static UserDto from(User user) {
//        return UserDto.builder()
//                .firstName(user.getUsername())
//                .role(user.getRoles())
//                .build();
//    }
}

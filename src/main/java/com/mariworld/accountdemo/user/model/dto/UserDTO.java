package com.mariworld.accountdemo.user.model.dto;

import com.mariworld.accountdemo.common.Converter;
import com.mariworld.accountdemo.user.model.entity.UserEntity;
import lombok.Data;

@Data
public class UserDTO implements Converter<UserEntity,UserDTO> {
    
    private final String id;
    private final String pwd;
    
    
    @Override
    public UserEntity convertTo(UserDTO userDTO) {
        return UserEntity.builder()
                .id(userDTO.getId())
                .pwd(userDTO.getPwd())
                .build();
    }
}
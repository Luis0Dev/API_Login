package com.Luis0DEV.DTO;

import com.Luis0DEV.Models.tb_user_userRole;

import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDTO {

    @ApiModelProperty(position = 0)
    private String usuario;
    @ApiModelProperty(position = 1)
    private String email;
    @ApiModelProperty(position = 2)
    private String senha;
    @ApiModelProperty(position = 3)
    List<tb_user_userRole> userRole;
}
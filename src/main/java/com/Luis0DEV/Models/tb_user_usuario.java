package com.Luis0DEV.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import lombok.*;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@Entity
public class tb_user_usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID user_n_codigo;


    @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
    @Column(unique = true, nullable = false)
    public String user_c_usuario;

    @Column(unique = true, nullable = false)
    public String user_c_email;

    @Size(min = 8,  message = "Minimum password length: 8 characters")
    @Column(unique = true, nullable = false)
    public String user_c_senha;

    @ElementCollection(fetch = FetchType.EAGER)
    List<tb_user_userRole> userUserRole;


    // Getters e Setters
    public UUID getUser_n_codigo() {
        return user_n_codigo;
    }

    public void setUser_n_codigo(UUID user_n_codigo) {
        this.user_n_codigo = user_n_codigo;
    }

    public String getUser_c_usuario() {
        return user_c_usuario;
    }

    public void setUser_c_usuario(String user_c_usuario) {
        this.user_c_usuario = user_c_usuario;
    }

    public String getUser_c_email() {
        return user_c_email;
    }

    public void setUser_c_email(String user_c_email) {
        this.user_c_email = user_c_email;
    }

    public String getUser_c_senha() {
        return user_c_senha;
    }

    public void setUser_c_senha(String user_c_senha) {
        this.user_c_senha = user_c_senha;
    }

    public List<tb_user_userRole> getUserUserRole() {
        return userUserRole;
    }

    public void setUserUserRole(List<tb_user_userRole> userUserRole) {
        this.userUserRole = userUserRole;
    }
}

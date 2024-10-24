package com.cricket_bash.team_players.controller;

import com.cricket_bash.team_players.dto.UserDTO;
import com.cricket_bash.team_players.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();

    }
}

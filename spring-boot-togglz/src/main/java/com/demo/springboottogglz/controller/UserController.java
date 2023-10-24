package com.demo.springboottogglz.controller;

import com.demo.springboottogglz.dto.UserDto;
import com.demo.springboottogglz.serivce.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create-user")
    public UserDto createUser(@RequestBody  UserDto userDto){

        return this.userService.saveUser(userDto);
    }
}

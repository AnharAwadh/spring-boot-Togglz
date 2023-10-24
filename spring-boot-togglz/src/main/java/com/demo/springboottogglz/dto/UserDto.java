package com.demo.springboottogglz.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private Long id;

    private  String name;

    private LocalDateTime creatDate;
    private Long age;
}

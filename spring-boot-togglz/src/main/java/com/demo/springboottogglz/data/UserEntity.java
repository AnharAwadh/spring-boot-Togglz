package com.demo.springboottogglz.data;

import com.demo.springboottogglz.dto.UserDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;

    private LocalDateTime creatDate;
    private Long age;


    public UserDto toDto() {
        UserDto userDto=new UserDto();
        userDto.setId(id);
        userDto.setAge(age);
        userDto.setName(name);
        userDto.setCreatDate(creatDate);
        return userDto;
    }
}

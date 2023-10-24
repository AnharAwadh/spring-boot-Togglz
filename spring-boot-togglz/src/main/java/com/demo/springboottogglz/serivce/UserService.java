package com.demo.springboottogglz.serivce;

import com.demo.springboottogglz.data.UserEntity;
import com.demo.springboottogglz.dto.UserDto;
import com.demo.springboottogglz.repositry.UserRepository;
import com.demo.springboottogglz.togglzconfig.UserFeature;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final FeatureManager featureManager;


    public UserDto saveUser(UserDto userDto){
        UserEntity user=new UserEntity();
        user.setAge(userDto.getAge());
        user.setName(userDto.getName());
        user.setCreatDate(LocalDateTime.now());
        if (featureManager.isActive(UserFeature.FEATURE_AGE)){
            user.setAge(27l);
        }
        UserEntity save = userRepository.save(user);

        return save.toDto();
    }
}

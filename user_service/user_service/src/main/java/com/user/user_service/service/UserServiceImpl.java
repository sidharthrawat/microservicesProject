package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    //fake user List

    List<User> list = List.of(
            new User(1311L,"sidharath","7404590817"),
            new User(1312L,"pitu","9729892313"),
            new User(1314L,"arun","7206888279")
    );


    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

package ru.ivk.springboot.services;

import ru.ivk.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}

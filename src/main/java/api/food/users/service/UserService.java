package api.food.users.service;

import api.food.users.model.User;

import java.util.List;

public interface UserService {

    User getUserByUsername(String username);
}

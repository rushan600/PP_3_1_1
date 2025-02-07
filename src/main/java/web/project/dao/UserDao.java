package web.project.dao;

import web.project.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
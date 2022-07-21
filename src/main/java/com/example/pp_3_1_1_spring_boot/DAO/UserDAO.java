package com.example.pp_3_1_1_spring_boot.DAO;



import com.example.pp_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();

    void saveUser(User user);

    public User getById(Long id);

    public void update(Long id, User user);

    public void delete(Long id);
}

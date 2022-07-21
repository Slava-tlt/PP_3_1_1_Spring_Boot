package com.example.pp_3_1_1_spring_boot.service;

import com.example.pp_3_1_1_spring_boot.DAO.UserDAO;
import com.example.pp_3_1_1_spring_boot.model.User;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAOImp;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAOImp = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAOImp.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAOImp.saveUser(user);
    }

    @Override
    @Transactional
    public User getById(Long id) {
        return userDAOImp.getById(id);
    }

    @Override
    @Transactional
    public void update(Long id, User user) {
        userDAOImp.update(id, user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDAOImp.delete(id);
    }
}

package com.example.pp_3_1_1_spring_boot.DAO;

import com.example.pp_3_1_1_spring_boot.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {

        return em.unwrap(Session.class).createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public User getById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(Long id, User user) {

        getById(id).setName(user.getName());
        getById(id).setSurName(user.getSurName());
        getById(id).setAge(user.getAge());
    }

    @Override
    public void delete(Long id) {
        em.remove(getById(id));
    }
}

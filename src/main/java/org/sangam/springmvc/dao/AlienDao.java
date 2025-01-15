package org.sangam.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sangam.springmvc.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AlienDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Alien> getAllAliens() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Alien").list();

    }

    @Transactional
    public void addAlien(Alien alien) {
        Session session = sessionFactory.getCurrentSession();
        session.save(alien);
    }

    @Transactional
    public Alien getAlien(int aid) {
        Session session = sessionFactory.getCurrentSession();
        Alien alien = session.get(Alien.class, aid);
        return alien;
    }
}

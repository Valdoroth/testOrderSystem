package com.ordering.testOrderSystem.dao;

import com.ordering.testOrderSystem.entity.Wings;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class WingsDAOImpl implements WingsDAO {
    private final EntityManager entityManager;

    @Autowired
    public WingsDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Wings> wingsList() {
        Session session = entityManager.unwrap(Session.class);
        Query<Wings> query = session.createQuery("from Wings");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Object wingsByID(int wingsId) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Wings.class, wingsId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Wings wings) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(wings);
    }

    @Override
    @Transactional
    public void deleteWings(int wingsId) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(wingsId);
    }
}

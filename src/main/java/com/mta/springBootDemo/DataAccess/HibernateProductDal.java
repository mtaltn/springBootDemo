package com.mta.springBootDemo.DataAccess;

import com.mta.springBootDemo.Entities.forMongo.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collections;

import javax.persistence.EntityManager;
import java.util.List;

public class HibernateProductDal implements IProductDal{
    private EntityManager entityManager;

    @Autowired
    public HibernateProductDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        Session session = entityManager.unwrap(Session.class);
        try {
            List<Product> products = session.createQuery("from Product", Product.class).getResultList();
            return products != null ? products : Collections.emptyList();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}

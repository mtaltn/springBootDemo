package com.mta.springBootDemo.DataAccess;

import com.mta.springBootDemo.Entities.forSqlServer.Category;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class HibernateCategoryDal implements ICategoryDal{
    private EntityManager entityManager;
    @Autowired
    public HibernateCategoryDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }

    @Override
    public void add(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }
}

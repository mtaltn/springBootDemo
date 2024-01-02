package com.mta.springBootDemo.Business.Managers;

import com.mta.springBootDemo.Business.Services.IProductService;
import com.mta.springBootDemo.DataAccess.IProductDal;
import com.mta.springBootDemo.Entities.forMongo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductManager implements IProductService {
    private IProductDal productDal;

    @Autowired
    public ProductManager(IProductDal productDal) {
        this.productDal = productDal;
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        return this.productDal.getAll();
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

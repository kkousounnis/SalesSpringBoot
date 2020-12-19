/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.product.services;

import java.util.List;
import javax.transaction.Transactional;
import net.codejava.product.dao.IProductDao;
import net.codejava.product.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author konstantinos
 */
@Service
@Transactional
public class ProductService implements IProductService {
    
    @Autowired
    private IProductDao dao;
    
    @Override
    public List<Product> listAll() {
        return dao.findAll();
    }
    
    @Override
    public void save(Product product) {
        dao.save(product);
    }
    
    @Override
    public Product get(long id) {
        return dao.findById(id).get();
    }
    
    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }
    
}

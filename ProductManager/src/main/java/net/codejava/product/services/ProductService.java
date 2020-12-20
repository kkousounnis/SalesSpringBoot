package net.codejava.product.services;

import java.util.List;
import javax.transaction.Transactional;
import net.codejava.product.dao.IProductDao;
import net.codejava.product.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Product get(int id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(int id) {
        dao.deleteById(id);
    }

}

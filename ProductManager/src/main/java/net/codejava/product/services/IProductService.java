package net.codejava.product.services;

import java.util.List;
import net.codejava.product.entities.Product;

public interface IProductService {

    public List<Product> listAll();

    public void save(Product product);

    public Product get(long id);

    public void delete(long id);
}

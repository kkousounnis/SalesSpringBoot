package net.codejava.product.services;

import java.util.List;
import net.codejava.product.entities.Product;

public interface IProductService {

    public List<Product> listAll();

    public void save(Product product);

    public Product get(int id);

    public void delete(int id);
}

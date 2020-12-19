/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.product.services;

import java.util.List;
import net.codejava.product.entities.Product;

/**
 *
 * @author konstantinos
 */
public interface IProductService {

    public List<Product> listAll();

    public void save(Product product);

    public Product get(long id);

    public void delete(long id);
}

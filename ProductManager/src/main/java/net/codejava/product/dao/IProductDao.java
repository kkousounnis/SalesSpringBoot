package net.codejava.product.dao;

import net.codejava.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product, Long> {

}

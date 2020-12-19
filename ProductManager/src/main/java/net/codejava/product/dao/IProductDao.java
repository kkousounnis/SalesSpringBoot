/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.product.dao;

import net.codejava.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author konstantinos
 */
public interface IProductDao extends JpaRepository<Product, Long> {
    
}

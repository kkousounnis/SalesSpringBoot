package net.codejava.product.controllers;

import java.util.List;
import net.codejava.product.entities.Product;
import net.codejava.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    
    @Autowired
    private ProductService service;
    
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Product> products = service.listAll(); 
        
        System.out.println(products);
        model.addAttribute("products", products);
        return "listproducts";
    }

}

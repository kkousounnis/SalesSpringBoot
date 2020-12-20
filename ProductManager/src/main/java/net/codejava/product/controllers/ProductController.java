package net.codejava.product.controllers;

import java.util.List;
import net.codejava.product.entities.Product;
import net.codejava.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping("/new")
    public String showNewProductPage(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        
        return "newproduct";
    }
    
    @RequestMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product){
        service.save(product);
        
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable( name = "id") int id){
        ModelAndView mav = new ModelAndView("edit_product");
        Product product = service.get(id);
        
        mav.addObject("product", product);
        
        return mav;
    }
    
    
    

}

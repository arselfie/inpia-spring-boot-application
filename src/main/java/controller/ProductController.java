package controller;

import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AbstractService;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private AbstractService<Product> service;


    @PostMapping(value = "/save")
    public void save(Product product){

        service.save(product);
    }





}

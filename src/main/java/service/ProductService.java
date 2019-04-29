package service;

import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements AbstractService<Product> {

    @Autowired
    private ProductRepository repository;


    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }
}

package controller;

import domain.Product;
import domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AbstractService;

@Controller
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    @Qualifier("provicerService")
    private AbstractService<Provider> service;

    @PostMapping(value = "/save")
    public void save(Provider provider){
        service.save(provider);

    }
}

package service;

import domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ProviderRepository;

import java.util.List;

@Service
@Transactional
public class ProviderService implements AbstractService<Provider> {

    @Autowired
    private ProviderRepository repository;

    public void save(Provider provider) {
        repository.save(provider);
    }

    @Override
    public List<Provider> getAll() {
        return repository.findAll();
    }
}

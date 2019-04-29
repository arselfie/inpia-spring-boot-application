package domain;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Provider {

    @Id
    @GeneratedValue
    @Column(name = "provider_id")
    private int id;

    private String name;

    private double sumForFreeDelievery;

    @OneToMany(cascade = {CascadeType.PERSIST}, orphanRemoval = true, mappedBy = "provider")
    private List<Product> products = new LinkedList<>();

    public Provider(String name, double sumForFreeDelievery) {
        this.name = name;
        this.sumForFreeDelievery = sumForFreeDelievery;
    }

    public Provider() {
    }


    public void addProduct(Product product){
        products.add(product);
    }
}

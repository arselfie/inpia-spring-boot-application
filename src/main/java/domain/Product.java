package domain;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;

    private String name;
    private double price;
    private double weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_fk_id")
    private Provider provider;
    private int packaging;

    public Product(String name, double price, double weight, Provider provider, int packaging) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.provider = provider;
        this.packaging = packaging;
    }

    public Product() {
    }
}

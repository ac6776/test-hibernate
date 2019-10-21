package ru.testhibernate;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "clients")
public class Client {
    @Id
    @GeneratedValue
    @Column//(name = "id")
    private Long id;

    @Column//(name = "name")
    private String name;

    @ManyToMany
    @JoinTable (
            name="client_product",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns =@JoinColumn(name = "product_id")
    )


    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name;
    }
}

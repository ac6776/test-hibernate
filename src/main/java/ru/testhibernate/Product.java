package ru.testhibernate;

import javax.persistence.*;

@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue
    @Column (name = "id")
    private Long id;

    @Column (name = "title")
    private String title;

    @Column (name = "cost")
    private double cost;

    @ManyToMany
    @JoinTable (
            name="client_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id: " + id + " title: " + title + " cost: " + cost;
    }
}

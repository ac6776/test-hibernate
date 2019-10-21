package ru.testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = null;

        try {
            // CREATE
//            session = factory.getCurrentSession();
//            Product product = new Product();
//            product.setTitle("Milk");
//            session.beginTransaction();
//            session.save(product);
//            session.getTransaction().commit();

            // READ
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class, 1L);
//            session.getTransaction().commit();
//            System.out.println(product);

            // UPDATE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class, 2L);
//            product.setTitle("Tea");
//            session.getTransaction().commit();

            // DELETE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class, 3L);
//            session.delete(product);
//            session.getTransaction().commit();

            // session = factory.getCurrentSession();
            // session.beginTransaction();
            // List<Product> allProducts = session.createQuery("from Product").getResultList();
            // from Product p where p.title = 'Bread' or p.title = 'Milk'
            // from Product p where p.title LIKE '%Milk'
            // from Product p where p.cost = :cost
//            List<Product> allProducts = session.createQuery("from Product p where p.cost = :cost")
//                    .setParameter("cost", 1000).getResultList();
            // System.out.println(allProducts);
            // session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.createQuery("update Product set cost = 100 where id = 3").executeUpdate();
//            session.createQuery("delete from Product where id = 2").executeUpdate();
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product1 = session.get(Product.class, 4L);
//            session.getTransaction().commit();
//            System.out.println(product1);
//            System.out.println(product1.getManufacturer().getTrademark());

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Manufacturer samsung = session.get(Manufacturer.class, 2L);
//            System.out.println(samsung);
//            System.out.println(samsung.getProducts());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Client client = session.get(Client.class, 4L);
            System.out.println(client.getProducts());
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}

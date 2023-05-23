package com.telusko.ProductSpringWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*

@Service
public class ProductService
{

    @Autowired
    ProductDB database;

    public void addProduct(Product p)
    {
        database.save(p);

    }

    public List<Product> getAllProducts()
    {

        return database.findAll();
    }

    public Product getProduct(String name)
    {

        return database.findByName(name);
    }


}
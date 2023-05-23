package com.telusko.ProductSpringWeb;
import  java.util.List;
import org.hibernate.procedure.ProcedureOutputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController
{
  @Autowired
  ProductService service;
  @GetMapping("/products")
    public List<Product> getAllProducts()
  {
      return service.getAllProducts();
  }
  @GetMapping("/product/{name}")
  public Product getProduct(@PathVariable String name)
  {
    return service.getProduct(name);
  }
  @PostMapping("/product")
  public void addProduct(@RequestBody Product p)
  {
    service.addProduct(p);
  }
}
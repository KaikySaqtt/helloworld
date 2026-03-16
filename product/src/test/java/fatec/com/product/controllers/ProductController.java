package fatec.com.product.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.com.product.models.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ArrayList<Product> getProducts() {

        //declara uma variável do tipo Product
        //Criar um objeto do tipo Product e atribui a variável
        Product p1 = new Product();
        p1.setDescription("celular pika");
        p1.setId(1L);
        p1.setName("celular");
        p1.setPrice(20.00);

        Product p2 = new Product();
        p2.setDescription("celular mais ou meno pika");
        p2.setId(2L);
        p2.setName("celular 2");
        p2.setPrice(15.00);
        Product p3 = new Product();
        p3.setDescription("celular nada pika");
        p3.setId(3L);
        p3.setName("celular 3");
        p3.setPrice(10.00);
        //Array para só objetos do tipo "Product"
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        return products;
    }
}

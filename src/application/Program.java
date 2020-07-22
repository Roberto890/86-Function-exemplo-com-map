package application;

import java.util.List;
import java.util.ArrayList;
import entities.Product;

public class Program {

    public static void main(final String[] args) {

        final List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));



        System.out.println("After:");
        for (Product product : list) {
            System.out.println(product.toString());
        }


        System.out.println("\nBefore:");
        list.forEach(System.out::println);
    }
}
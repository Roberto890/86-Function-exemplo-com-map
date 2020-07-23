package application;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;
import entities.Product;
import util.UpperCaseName;

public class Program {

    public static void main(final String[] args) {

        final List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //4ª implementação - Expressão lambda declarada
        Function<Product,String> func = p -> p.getName().toUpperCase();

        System.out.println("After:");
        for (Product product : list) {
            System.out.println(product.toString());
        }

        //1ª implementação - implementação da interface
        //Função map (não é a estrutura de dados Map) é uma função que aplica uma função
        //a todos elementos de uma stream. Vai ter q converter a list p/ stream e vice versa
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //2ª implementação - Reference method com método estático
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //3ª implementação - Reference method sem método estático
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //4ª implementação - Expressão lambda declarada
        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        //5ª implementação - Expressão lambda Inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


        for (Product product : list) {
            product.setName(names.get(names.indexOf(product.getName().toUpperCase())));
        }

        System.out.println("\nBefore:");
        list.forEach(System.out::println);
    }
}
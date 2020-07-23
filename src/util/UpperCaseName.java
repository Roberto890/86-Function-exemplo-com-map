package util;

import java.util.function.Function;

import entities.Product;
                        //pra function tem que colocar o metodo de entrada e o de saida
                        //no caso recebe um produto e retorna uma string
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
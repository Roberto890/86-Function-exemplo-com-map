package entities;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //2ª implementação - Reference method com método estático
    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }

    //3ª implementação - Reference method sem método estático
    public String nonStaticUpperCaseName(){
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Product [name = "+getName()+", " + "price = " + String.format("%.2f", getPrice()) + "]";
    }

    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }

}
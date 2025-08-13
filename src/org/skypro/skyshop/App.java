package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
       Product broad = new Product("Хлеб", 45);
       Product oil = new Product("Масло", 150);
       Product water = new Product("Вода", 70);
       Product tomato = new Product("Помидор", 49);
       Product sugar = new Product("Сахар", 150);
       Product salt = new Product("Соль", 70);


       ProductBasket myBasket = new ProductBasket();
       myBasket.addProduct(broad);
       myBasket.addProduct(oil);
       myBasket.addProduct(water);
       myBasket.addProduct(tomato);
       myBasket.addProduct(sugar);
       myBasket.addProduct(salt);



       myBasket.printBasket();

       System.out.println(myBasket.containsProduct("Сахар"));

       System.out.println(myBasket.containsProduct("кетчуп"));

       myBasket.clearBasket();
       myBasket.printBasket();
       System.out.println(myBasket.containsProduct("Хлеб"));

    }


}

package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private int occupiedPlaces = 0; // количество занятых ячеек
    private Product[] products = new Product[5];

    public int getOccupiedPlaces() {                // геттер для переменной
        return occupiedPlaces;
    }

    public void addProduct(Product someProduct) {
        if (occupiedPlaces < products.length) {
            products[occupiedPlaces] = someProduct;
            this.occupiedPlaces++;
        } else {
            System.out.println("Корзина полная!");
        }
    }


    public int getBasketTotalCost() {
        int basketTotalCost = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                int cost = products[i].getProductCost();
                basketTotalCost = basketTotalCost + cost;
            }

        }
        return basketTotalCost;
    }

    public void printBasket() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                Product product = products[i];
                System.out.printf("<%s>:<%d>%n", product.getProductName(), product.getProductCost());
            }

        }
        System.out.printf("Итого: <%d>", getBasketTotalCost());
    }

    public boolean containsProduct(String name) {
        boolean result = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                Product product = products[i];
                if (product.getProductName().equals(name)) {
                    result = true;
                }
            }

        }
        return result;
    }

    public void clearBasket(){
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        occupiedPlaces = 0;
        System.out.println("Корзина очищена!");
    }
}

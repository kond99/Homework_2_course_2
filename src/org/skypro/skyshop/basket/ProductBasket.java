package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;

public class ProductBasket {

    private int occupiedPlaces = 0; // количество занятых ячеек
    private Product[] products = new Product[5];

    public int getOccupiedPlaces() {
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

    public Product[] getProducts() {
        return products;
    }

    public int getBasketTotalCost() {
        int basketTotalCost = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                Product product = products[i];
                int cost = product.getProductCost();
                basketTotalCost = basketTotalCost + cost;
            }

        }
        return basketTotalCost;
    }

    public void printBasketCondition() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                Product product = products[i];
                System.out.printf("<%s>:<%d>", product.getProductName(), product.getProductCost());
            }
            System.out.println();

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

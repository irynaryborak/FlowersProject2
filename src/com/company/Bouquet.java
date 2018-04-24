package com.company;

import java.util.ArrayList;

public interface Bouquet {

    public double getFinalPrice(ArrayList<Flowers> list, double totalPrice);
    public void displayBouquet(ArrayList<Flowers> list);
    public ArrayList<Flowers> createDefaultBouquet();

    public default void findFlowerByLength(ArrayList<Flowers> list) {

    }
}
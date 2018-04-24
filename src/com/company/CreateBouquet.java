package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class CreateBouquet implements Bouquet {

    public static void createBouquet() {

        CreateBouquet createBouquet = new CreateBouquet();
        ArrayList<Flowers> list = createBouquet.createDefaultBouquet();

        createBouquet.displayBouquet(list);

        double totalPrice=0;
        totalPrice = createBouquet.getFinalPrice(list, totalPrice);
        System.out.println("\nTotal cost of your bouquet is: " + totalPrice + "\n");

        System.out.println("Sorted list by Freshness:\n");
        Collections.sort(list, new Sorting());
        createBouquet.displayBouquet(list);

        System.out.println("\n" +
                "And now let's find some flowers by their length.\n" +
                "Please enter first and last numbers of range");
        createBouquet.findFlowerByLength(list);
    }

    // create bouquet
    public ArrayList<Flowers> createDefaultBouquet(){
        List<Flowers> list = new ArrayList<>();

        list.add(new Roses("Pink Rose", 25.5, 10, 1));
        list.add(new Roses("White Rose", 30, 15, 2));
        list.add(new Tulips("Avory Tulip", 15, 14, 1));
        list.add(new Tulips("Red Tulip", 20.5, 12, 2));
        list.add(new Orchids("Violet Orchid", 150, 25, 3));
        list.add(new Orchids("Yellow Orchid", 235, 30, 3));
        return (ArrayList<Flowers>) list;
    }

    // display bouquet
    public void displayBouquet(ArrayList<Flowers> list) {
        int i = 1;
        System.out.println("ID: " + " NAME:    " + " 	    	  Price: " + "	Length:  " + " Fresh:");
        for (Flowers vault : list) {

            System.out.println(i + ".   " + vault.getName() + "  	  " + vault.getPrice() + "		" + vault.getLength()
                    + "   	  " + vault.getFresh());
            i++;
        }
    }

    // count price of bouquet
    public double getFinalPrice(ArrayList<Flowers> list, double totalPrice) {

        for (Flowers vault : list) {
            totalPrice += vault.getPrice();
        }
        return totalPrice;
    }

    // find flowers with selected length
    public void findFlowerByLength(ArrayList<Flowers> list) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int j = 1;
        for (Flowers vault : list) {
            if ((vault.getLength() >= a && vault.getLength() <= b) || (vault.getLength() >= b && vault.getLength() <= a)){
                System.out.println("\nYour flower is: " + vault.getName() + ", length=" + vault.getLength());
            }
            j++;
        }
    }
}

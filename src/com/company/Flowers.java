package com.company;

public class Flowers {

    private	String name;
    private double price;
    private int length;
    private int fresh;

    public Flowers (String name, double price, int length, int fresh){
        this.name = name;
        this.price = price;
        this.length = length;
        this.fresh = fresh;
    }

    public Flowers() {}

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getLength(){
        return length;
    }

    public int getFresh(){
        return fresh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void setFresh(int fresh) {
        this.fresh = fresh;
    }
}

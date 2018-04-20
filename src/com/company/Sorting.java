package com.company;

import com.company.Flowers;

import java.util.Comparator;

public class Sorting implements Comparator<Flowers> {


    public int compare(Flowers o1, Flowers o2) {

        double p1 = o1.getFresh();
        double p2 = o2.getFresh();

        if (p1 < p2){
            return 1;
        }
        else if (p1 > p2){
            return -1;
        }
        else return 0;
    }
}

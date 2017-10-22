package com.company;

/**
 * Created by andy on 22.10.2017.
 */
public class Link {
    public int key;
    public double dataD;
    public Link next;

    public Link(int key, double dataD) {
        this.key = key;
        this.dataD = dataD;
        next = null;
    }

    public void displayLink() {
        System.out.print("{" + key + " " + dataD + "}");
    }

//    public boolean isEmpty(){
//        if
//    }
}

package com.company;

/**
 * Created by andy on 21.10.2017.
 */
public class Form {
    double x1, y1, x2, y2, sideX, sideY, sideZ, perimetr, area;

    public Form(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getSideX() {
        return sideX;
    }

    public double getSideY() {
        return sideY;
    }

    public double getSideZ() {
        return sideZ;
    }

    public double getPerim() {
        return perimetr;
    }

    public double getArea() {
        return area;
    }
}

}

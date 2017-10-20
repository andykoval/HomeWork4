package com.company;

/**
 * Создается прямоугольник принимающий 2 координаты
 */


public class Restangle {
    static double x1, y1, x2, y2, sideX, sideY, perimetr, area;


    public Restangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static double getSideX() {
        sideX = Math.abs(x1 - x2);
        return sideX;
    }

    public static double getSideY() {
        sideY = Math.abs(y1 - y2);
        return sideY;
    }

    public static double getPerim() {
        perimetr = (getSideX() + getSideY()) * 2;
        return perimetr;
    }

    public double getArea() {
        area = getSideX() * getSideY();
        return area;
    }
}

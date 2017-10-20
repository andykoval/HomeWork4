package com.company;

/**
 * Создается круг принимающий координаты центра и точки на окружности
 */

public class Circle {
    double x1, y1, x2, y2, sideX, sideY, sideZ, rad, perimetr, area;
    public final double PI = 3.14159265;


    public Circle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double getSideX() {
        sideX = Math.abs(x1 - x2);
        return sideX;
    }

    public double getSideY() {
        sideY = Math.abs(y1 - y2);
        return sideY;
    }

    public double getSideZ() {
        sideZ = Math.sqrt(getSideX() * getSideX() + getSideY() * getSideY());
        return sideZ;
    }


    public double getRad() {
        rad = getSideZ();
        return rad;
    }

    public double getPerim() {
        perimetr = 2*PI*getRad();
        return perimetr;
    }

    public double getArea() {
        area = PI*(getRad()*getRad());
        return area;
    }
}

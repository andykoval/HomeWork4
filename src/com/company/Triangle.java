package com.company;

/**
 * Создается прямоугольный треугольник принимающий 2 координаты
 */
public class Triangle extends Form{
    double x1, y1, x2, y2, sideX, sideY, sideZ, perimetr, area;


    public Triangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }
@Override
    public double getSideX() {
        sideX = Math.abs(x1 - x2);
        return sideX;
    }
@Override
    public double getSideY() {
        sideY = Math.abs(y1 - y2);
        return sideY;
    }

    public double getSideZ() {
        sideZ = Math.sqrt(getSideX() * getSideX() + getSideY() * getSideY());
        return sideZ;
    }

    public double getPerim() {
        perimetr = getSideX() + getSideY() + getSideZ();
        return perimetr;
    }

    public double getArea() {
        area = (getSideX() * getSideY()) / 2;
        return area;
    }
}

package com.chmnu_ki_123.c3;

public class Prism {
    private double sideLength;
    private double height;

    public Prism(double sideLength, double height) {
        if (sideLength <= 0 || height <= 0) {
            throw new IllegalArgumentException("Сторона і висота повинні бути більшими за нуль.");
        }
        this.sideLength = sideLength;
        this.height = height;
    }

    public double getLateralSurfaceArea() {
        double perimeter = 3 * sideLength;
        return perimeter * height;
    }

    // Метод для обчислення об'єму призми
    public double getVolume() {
        double triangleArea = (Math.sqrt(3) / 4) * sideLength * sideLength;
        return triangleArea * height;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeight() {
        return height;
    }

    public void setSideLength(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Сторона повинна бути більшою за нуль.");
        }
        this.sideLength = sideLength;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Висота повинна бути більшою за нуль.");
        }
        this.height = height;
    }

    public static void main(String[] args) {
        Prism prism = new Prism(5, 10);

        System.out.println("Площа бічної поверхні: " + prism.getLateralSurfaceArea());
        System.out.println("Об'єм призми: " + prism.getVolume());
    }
}

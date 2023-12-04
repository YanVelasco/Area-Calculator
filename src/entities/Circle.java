package entities;

import java.text.DecimalFormat;

import entities.enums.Color;

public class Circle extends Shape {
    Double radius;
    final double pi = Math.PI;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getPi() {
        return this.pi;
    }

    @Override
    public void area() {
        Double circleArea = pi * Math.pow(radius, 2);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Circle area is: " + decimalFormat.format(circleArea));
    }

}

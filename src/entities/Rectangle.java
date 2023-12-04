package entities;

import java.text.DecimalFormat;

import entities.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public void area() {
        double rectangleArea = width * height;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Rectangle Area is: " + decimalFormat.format(rectangleArea));
    }
}

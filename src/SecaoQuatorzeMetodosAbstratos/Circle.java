package SecaoQuatorzeMetodosAbstratos;

import enums.ColorSecaoQuatorzeMetodosAbstratos;

public class Circle extends Shape{
    private Double radius;

    public Circle(){};

    public Circle(ColorSecaoQuatorzeMetodosAbstratos color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

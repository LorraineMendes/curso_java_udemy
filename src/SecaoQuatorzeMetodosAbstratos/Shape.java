package SecaoQuatorzeMetodosAbstratos;

import enums.ColorSecaoQuatorzeMetodosAbstratos;

public abstract class Shape {
    private ColorSecaoQuatorzeMetodosAbstratos color;

    public Shape(){
    }

    public Shape(ColorSecaoQuatorzeMetodosAbstratos color) {
        this.color = color;
    }

    public ColorSecaoQuatorzeMetodosAbstratos getColor() {
        return color;
    }

    public void setColor(ColorSecaoQuatorzeMetodosAbstratos color) {
        this.color = color;
    }

    public abstract double area();
}

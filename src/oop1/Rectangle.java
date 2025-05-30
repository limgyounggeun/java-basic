package oop1;

public class Rectangle {
    int width;
    int height;
    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        if(width == height) {
           return true;
        }else {
            return false;
        }
    }
    int calculateArea() {
        return width * height;
    }
    int calculatePerimeter() {
        return 2 * (width+height);
    }
}

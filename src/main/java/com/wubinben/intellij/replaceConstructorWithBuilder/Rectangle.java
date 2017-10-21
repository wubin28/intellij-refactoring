package com.wubinben.intellij.replaceConstructorWithBuilder;

import java.awt.*;

public class Rectangle {
    public Rectangle(int x, int y, int width, int height, int thickness, Color fillColor, Color borderColor) {
    }
    public void show() {
    }
    public static void main(String[] args) {
        Rectangle rectangle = new RectangleBuilder().setX(1).setY(2).setWidth(3).setHeight(4).setThickness(5).setFillColor(Color.green).setBorderColor(Color.blue).createRectangle();
        rectangle.show();
    }
}

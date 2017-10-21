package com.wubinben.intellij.replaceConstructorWithBuilder;

import java.awt.*;

public class Rectangle {
    public Rectangle(int x, int y, int width, int height, int thickness, Color fillColor, Color borderColor) {
    }
    public void show() {
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4, 5, Color.green, Color.blue);
        rectangle.show();
    }
}

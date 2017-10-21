package com.wubinben.intellij.replaceConstructorWithBuilder.builderPattern;

import java.awt.*;

public class RectangleBuilder {
    private int x;
    private int y;
    private int width;
    private int height;
    private int thickness;
    private Color fillColor;
    private Color borderColor;

    public RectangleBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public RectangleBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public RectangleBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public RectangleBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public RectangleBuilder setThickness(int thickness) {
        this.thickness = thickness;
        return this;
    }

    public RectangleBuilder setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public RectangleBuilder setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Rectangle createRectangle() {
        return new Rectangle(x, y, width, height, thickness, fillColor, borderColor);
    }
}
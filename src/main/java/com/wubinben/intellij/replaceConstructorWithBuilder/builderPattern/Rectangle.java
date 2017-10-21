package com.wubinben.intellij.replaceConstructorWithBuilder.builderPattern;

import java.awt.*;

public class Rectangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final int thickness;
    private final Color fillColor;
    private final Color borderColor;

    public static class Builder {
        // Required parameters
        private final int width;
        private final int height;

        // Optional parameters - initialized to default values
        private int x = 1;
        private int y = 2;
        private int thickness = 5;
        private Color fillColor = Color.black;
        private Color borderColor = Color.black;

        public Builder(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle.Builder x(int val) {
            x = val;
            return this;
        }
        public Rectangle.Builder y(int val) {
            y = val;
            return this;
        }
        public Rectangle.Builder thickness(int val) {
            thickness = val;
            return this;
        }
        public Rectangle.Builder fillColor(Color val) {
            fillColor = val;
            return this;
        }
        public Rectangle.Builder borderColor(Color val) {
            borderColor = val;
            return this;
        }

        public Rectangle build() {
            return new Rectangle(this);
        }
    }

    private Rectangle(Builder builder) {
        x = builder.x;
        y = builder.y;
        width = builder.width;
        height = builder.height;
        thickness = builder.thickness;
        fillColor = builder.fillColor;
        borderColor = builder.borderColor;
    }

    public void show() {
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle.Builder(3, 4).x(1).y(2)
                .thickness(5).fillColor(Color.green).borderColor(Color.blue)
                .build();
        rectangle.show();
    }
}

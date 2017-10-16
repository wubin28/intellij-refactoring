package com.wubinben.intellij.extractParameterObject;

import java.awt.*;

public class A {
    private void drawEdge(Graphics g, Edge edge) {
        final Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(edge.getEdgeWidth()));
        g.drawLine(edge.getX1(), edge.getY1(), edge.getX2(), edge.getY2());
    }
}

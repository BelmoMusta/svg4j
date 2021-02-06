package musta.belmo.svg.shapes;


import java.awt.*;
import java.awt.geom.Area;

public interface AbstractShape {
    boolean isFill();

    Color getColor();

    Shape getShape();

    void setColor(Color color);

    AbstractShape getStroke();

    boolean isGeometricShape();

    String getTextValue();

    Point getPosition();

    Font getFont();

    Area toArea();
}

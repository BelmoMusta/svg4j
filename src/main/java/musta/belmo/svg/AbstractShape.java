package musta.belmo.svg;

import java.awt.*;

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
}

package musta.belmo.svg;

import java.awt.*;
import java.awt.geom.Area;

public class StrokeShape implements AbstractShape {
    public StrokeShape(Shape mShape) {
        this.mShape = mShape;
    }

    private Shape mShape;
    private Color color;

    public Shape getShape() {
        return mShape;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public AbstractShape getStroke() {
        return new StrokeShape(mShape);
    }

    @Override
    public boolean isGeometricShape() {
        return true;
    }

    @Override
    public String getTextValue() {
        return "";
    }

    @Override
    public Point getPosition() {
        return mShape.getBounds().getLocation();
    }

    @Override
    public Font getFont() {
        return null;
    }

    @Override
    public Area toArea() {
        return new Area(getShape());
    }


    @Override
    public boolean isFill() {
        return false;
    }
}

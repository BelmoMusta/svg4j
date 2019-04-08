package musta.belmo.svg;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Factory {

    public static AbstractShape createRectangle(int x, int y, int width, int height) {
        return new FilledShape(new Rectangle(x, y, width, height));
    }

    public static AbstractShape createEllipse(int x, int y, int width, int height) {
        return new FilledShape(new Ellipse2D.Double(x, y, width, height));
    }
}

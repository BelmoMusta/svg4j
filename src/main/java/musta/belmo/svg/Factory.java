package musta.belmo.svg;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Factory {

    public static AbstractShape createRectangle(int x, int y, int width, int height) {
        return new FilledShape(new Rectangle(x, y, width, height));
    }

    public static AbstractShape createEllipse(int x, int y, int width, int height) {
        return new FilledShape(new Ellipse2D.Double(x, y, width, height));
    }

    public static AbstractShape createTextShape(String text, int x, int y, int width, int height) {
        return new TextShape(text, createRectangle(x, y, width, height));
    }

    public static java.util.List<AbstractShape> generateClassShape(int x, int y, int size, String className) {

        int rectWidth = (int) (4.5 * size);
        AbstractShape rectangleShape = Factory.createRectangle(x + size / 2, (int) (y + size * .05), rectWidth, (int) (size * .9));
        AbstractShape textShape = new TextShape(className, rectangleShape);
        AbstractShape ellipseShape = Factory.createEllipse(x, y, size, size);
        AbstractShape rectangleStroke = rectangleShape.getStroke();
        AbstractShape ellipseStroke = ellipseShape.getStroke();

        rectangleShape.setColor(Color.YELLOW);
        rectangleStroke.setColor(Color.BLACK);
        ellipseShape.setColor(Color.YELLOW);
        ellipseStroke.setColor(Color.BLACK);
        textShape.setColor(Color.BLUE);
        java.util.List<AbstractShape> svgPlan = new ArrayList<>();
        svgPlan.add(textShape);
        svgPlan.add(rectangleShape);
        svgPlan.add(rectangleStroke);
        svgPlan.add(ellipseShape);
        svgPlan.add(ellipseStroke);

        return svgPlan;
    }
}

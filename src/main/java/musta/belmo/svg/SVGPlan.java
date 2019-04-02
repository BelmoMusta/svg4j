package musta.belmo.svg;

import org.jfree.graphics2d.svg.SVGGraphics2D;

import java.util.ArrayList;
import java.util.List;

public class SVGPlan {
    private int width;
    private int height;

    public SVGPlan(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private List<AbstractShape> elements = new ArrayList<>();

    public boolean add(AbstractShape shape) {
        return elements.add(shape);
    }

    public SVGGraphics2D render() {
        SVGGraphics2D graphics2D = new SVGGraphics2D(width, height);
        elements.stream().filter(AbstractShape::isGeometricShape)
                .forEach(element -> {
                    graphics2D.setColor(element.getColor());
                    if (element.isFill()) {
                        graphics2D.fill(element.getShape());
                    } else {
                        graphics2D.draw(element.getShape());
                    }
                });

        elements.stream().filter(element -> !element.isGeometricShape()).forEach(textShape -> {
            graphics2D.setFont(textShape.getFont());
            graphics2D.drawString(textShape.getTextValue(),
                    (int) textShape.getPosition().getX(),
                    (int) (  textShape.getPosition().getY()));
        });

        return graphics2D;
    }
}

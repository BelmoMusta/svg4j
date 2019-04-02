package musta.belmo.svg;

import java.awt.*;

public class TextShape extends StrokeShape {

    private String textValue;
    private Point position;

    public TextShape(String textValue, Point point) {
        super(new Rectangle(point));
        this.position = point;
        this.textValue = textValue;
    }

    public TextShape(String textValue, int x, int y) {
        this(textValue, new Point(x, y));
    }

    public TextShape(String textValue, Shape container) {
        super(container);
        this.textValue = textValue;
    }

    @Override
    public boolean isGeometricShape() {
        return false;
    }

    @Override
    public String getTextValue() {
        return this.textValue;
    }

    @Override
    public Point getPosition() {
        Point currentPosition;
        if (position != null) {
            currentPosition = position;
        } else {
            Rectangle bounds = getShape().getBounds();
            currentPosition = new Point((int) bounds.getCenterX(), (int) bounds.getCenterY());
        }
        currentPosition.y += 24 * 0.3;
        currentPosition.x -= getTextValue().length() * 7;
        return currentPosition;

    }

    @Override
    public Font getFont() {
        return new Font("TimesRoman", Font.PLAIN, 24);
    }
}

package musta.belmo.svg;

import java.awt.*;

public class FilledShape extends StrokeShape {

    public FilledShape(Shape mShape) {
        super(mShape);
    }

    @Override
    public boolean isFill() {
        return true;
    }
}

package musta.belmo.svg;

import org.jfree.graphics2d.svg.SVGGraphics2D;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

//

public class TestSVG {

    static String generateClassShape(int x, int y, int size, String className) {
        SVGPlan g2 = new SVGPlan(10240, 7680);

        int rectWidth = (int) (4.5 * size);
        Rectangle rect = new Rectangle(x + size / 2, (int) (y + size * .05), rectWidth, (int) (size * .9));
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, size, size);

        AbstractShape rectangleShape = new FilledShape(rect);
        AbstractShape textShape = new TextShape(className, rect);
        AbstractShape ellipseShape = new FilledShape(ellipse);
        AbstractShape rectangleStroke = rectangleShape.getStroke();
        AbstractShape ellipseStroke = ellipseShape.getStroke();

        rectangleShape.setColor(Color.YELLOW);
        rectangleStroke.setColor(Color.BLACK);
        ellipseShape.setColor(Color.YELLOW);
        ellipseStroke.setColor(Color.BLACK);
        textShape.setColor(Color.BLUE);

        g2.add(textShape);
        g2.add(rectangleShape);
        g2.add(rectangleStroke);
        g2.add(ellipseShape);
        g2.add(ellipseStroke);

        return g2.render().getSVGDocument();
    }

    private static Shape getLine(int fromX, int fromY, int toX, int toY) {
        return new Line2D.Double(fromX, fromY, toX, toY);
    }


    public static void main(String[] args) throws Exception {
        BufferedWriter writer ;
        FileOutputStream fos = new FileOutputStream("SVGDemo1.svg");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        writer = new BufferedWriter(osw);
        SVGGraphics2D g2 = new SVGGraphics2D(10240, 7680);

        ///writer.write(g2.getSVGDocument());
        String shape = generateClassShape(30, 50, 100, "LOOOOOOOOOOOOL");


        writer.write(shape);
        writer.close();
    }
}

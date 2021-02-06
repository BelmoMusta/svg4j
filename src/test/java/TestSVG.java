import com.github.javaparser.JavaParser;
import musta.belmo.svg.shapes.AbstractShape;
import musta.belmo.svg.Mapper;
import musta.belmo.svg.SVGPlan;
import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.Line2D;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

//

public class TestSVG {

    private Shape getLine(int fromX, int fromY, int toX, int toY) {
        return new Line2D.Double(fromX, fromY, toX, toY);
    }

    @Test
    public void testGenerateSvg() throws Exception {
        BufferedWriter writer;
        FileOutputStream fos = new FileOutputStream("SVGDemo1.html");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        writer = new BufferedWriter(osw);
        SVGGraphics2D g2 = new SVGGraphics2D(10240, 7680);
        
        Mapper mapper = new Mapper();
        List<AbstractShape> shapeFor = mapper.getShapeFor(JavaParser.parse(new File("D:\\0001_PERSO\\CODE\\svg4j\\src" +
                "\\test\\java\\Example.java")));
        SVGPlan plan = new SVGPlan(10240, 7680);
        plan.addAll(shapeFor);
        writer.write(plan.render().getSVGDocument());
        writer.close();
    }
}

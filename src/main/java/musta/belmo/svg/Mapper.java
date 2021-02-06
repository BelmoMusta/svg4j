package musta.belmo.svg;

import com.github.javaparser.ast.CompilationUnit;
import musta.belmo.svg.shapes.AbstractShape;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public List<AbstractShape> getShapeFor(CompilationUnit node) {
        String string = node.toString(new SVGPrinter());
        System.out.println("________________________");
        System.out.println(string);
        System.out.println("________________________");
        List<AbstractShape> list = new ArrayList<>();
        
        //node.accept(new SvgVisitor(), list);
        return list;
    }
}

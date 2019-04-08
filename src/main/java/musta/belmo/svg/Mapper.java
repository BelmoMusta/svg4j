package musta.belmo.svg;

import com.github.javaparser.ast.CompilationUnit;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public List<AbstractShape> getShapeFor(CompilationUnit node) {
        List<AbstractShape> list = new ArrayList<>();
        node.accept(new NodeToShapeVisitor(), list);
        return list;
    }
}

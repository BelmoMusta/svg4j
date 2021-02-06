package musta.belmo.svg.visitor;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.printer.PrettyPrinterConfiguration;
import com.github.javaparser.utils.Utils;
import musta.belmo.svg.shapes.AbstractShape;
import musta.belmo.svg.Factory;
import musta.belmo.svg.SVGPlan;
import org.jfree.graphics2d.svg.SVGGraphics2D;

import java.util.List;

public class SvgVisitor extends AbstractSvgVisitor {
	final SVGPlan plan;
	int classLevel;
	
	public SvgVisitor(PrettyPrinterConfiguration prettyPrinterConfiguration) {
		super(prettyPrinterConfiguration);
		plan = new SVGPlan(10240, 7680);
	}
	
	public void visit(final ClassOrInterfaceDeclaration n, final Void arg) {
		List<AbstractShape> shape = Factory.generateClassShape(30, 50 + 20 * classLevel, 100, n.getNameAsString());
		plan.addAll(shape);
		SVGGraphics2D render = plan.render();
		this.printer.print(render.getSVGDocument());
		classLevel += 20;
		super.printTypeParameters(n.getTypeParameters(), arg);
		
		this.printer.indent();
		if (!Utils.isNullOrEmpty(n.getMembers())) {
			this.printMembers(n.getMembers(), arg);
		}
		
		this.printOrphanCommentsEnding(n);
		this.printer.unindent();
		this.printer.print("}");
	}
}
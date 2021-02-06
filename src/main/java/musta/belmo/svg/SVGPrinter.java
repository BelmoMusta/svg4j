package musta.belmo.svg;

import com.github.javaparser.printer.PrettyPrintVisitor;
import com.github.javaparser.printer.PrettyPrinterConfiguration;
import musta.belmo.svg.visitor.SvgVisitor;

import java.util.function.Function;

public class SVGPrinter extends PrettyPrinterConfiguration {
	@Override
	public Function<PrettyPrinterConfiguration, PrettyPrintVisitor> getVisitorFactory() {
		return  SvgVisitor::new;
	}
}

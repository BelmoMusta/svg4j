package musta.belmo.svg.shapes;

public class SVGCirclePoint extends SVGPoint {
	public SVGCirclePoint(double x, double y) {
		super(x, y);
	}
	
	@Override
	public String toString() {
		return " cx=\"" + x + "\" " + "cy=\"" + y + "\" ";
	}
}

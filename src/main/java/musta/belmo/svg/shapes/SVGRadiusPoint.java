package musta.belmo.svg.shapes;

public class SVGRadiusPoint extends SVGPoint {
	public SVGRadiusPoint(double x, double y) {
		super(x, y);
	}
	
	@Override
	public String toString() {
		return " rx=\"" + x + "\" " + "ry=\"" + y + "\" ";
	}
	
}

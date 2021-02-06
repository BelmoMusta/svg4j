package musta.belmo.svg.shapes;

public class SVGRectanglePoint extends SVGPoint {
	public SVGRectanglePoint(double x, double y) {
		super(x, y);
	}
	
	@Override
	public String toString() {
		return " x=\"" + x + "\" " + "y=\"" + y + "\" ";
	}
}

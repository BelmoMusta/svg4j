package musta.belmo.svg.shapes;

public class SVGPoint {
	protected double x;
	protected double y;
	
	public SVGPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}
}

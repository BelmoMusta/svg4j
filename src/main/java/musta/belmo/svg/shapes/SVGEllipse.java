package musta.belmo.svg.shapes;

public class SVGEllipse extends SVGShape {
	private SVGCirclePoint circlePoint;
	private SVGRadiusPoint radiusPoint;
	
	
	public String render() {
		StringBuilder sb = new StringBuilder();
		sb.append("<ellipse ")
				.append(circlePoint)
				.append(radiusPoint)
				.append(fillAndStroke())
				.append("/>");
		return sb.toString();
	}
	
	public SVGEllipse circlePoint(SVGCirclePoint svgCirclePoint) {
		circlePoint = svgCirclePoint;
		return this;
	}
	
	public SVGEllipse radiusPoint(SVGRadiusPoint svgRadiusPoint) {
		radiusPoint = svgRadiusPoint;
		return this;
	}
	
	public static void main(String[] args) {
		SVGEllipse ellipse = new SVGEllipse();
		ellipse.circlePoint(new SVGCirclePoint(40, 40))
				.radiusPoint(new SVGRadiusPoint(40, 40));
		System.out.println("ellipse.render() = " + ellipse.render());
	}
}

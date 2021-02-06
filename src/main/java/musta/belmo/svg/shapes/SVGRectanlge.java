package musta.belmo.svg.shapes;

public class SVGRectanlge extends SVGShape {
	private SVGRectanglePoint startPoint;
	private double width;
	private double height;
	
	public SVGRectanlge startPoint(SVGRectanglePoint newStratPoint) {
		startPoint = newStratPoint;
		return this;
	}
	
	public SVGRectanlge startPoint(double x, double y) {
		return startPoint(new SVGRectanglePoint(x, y));
	}
	
	public SVGRectanlge width(double width) {
		this.width = width;
		return this;
	}
	
	public SVGRectanlge height(double height) {
		this.height = height;
		return this;
	}
	
	
	public String render() {
		//<rect x="50" y="0" width="350" height="80" fill="#fff2cc" stroke="#d6b656" pointer-events="all"/>
		final StringBuilder sb = new StringBuilder();
		sb.append("<rect ")
				.append(startPoint)
				.append(" width=\"")
				.append(width)
				.append("\" ")
				.append(" height=\"")
				.append(height)
				.append("\" ")
				.append(super.fillAndStroke())
				.append("/>");
		return sb.toString();
	}
}

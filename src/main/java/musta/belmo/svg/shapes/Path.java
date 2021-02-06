package musta.belmo.svg.shapes;


import java.util.ArrayList;
import java.util.List;

public class Path extends SVGShape {
	private SVGPoint moveto = new SVGPoint(0, 0);
	private List<SVGPoint> points = new ArrayList<>();
	
	
	public String render() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<path d=\" M ")
				.append(moveto)
				.append(" ");
		for (SVGPoint point : points) {
			sb.append("L ")
					.append(point)
					.append(" ");
		}
		sb.append("\"");
		sb.append(" stroke=")
				.append("\"")
				.append(stroke)
				.append("\"")
				.append(" fill=")
				.append("\"")
				.append(fill)
				.append("\"")
				.append("/>");
		return sb.toString();
	}
	
	public Path moveto(SVGPoint newMoveto) {
		this.moveto = newMoveto;
		return this;
	}
	
	public Path moveto(double x, double y) {
		return moveto(new SVGPoint(x, y));
		
	}
	
	public Path lineto(double x, double y) {
		return lineto(new SVGPoint(x, y));
		
	}
	
	public Path lineto(SVGPoint nextLineTo) {
		points.add(nextLineTo);
		return this;
	}
	
	public Path stroke_(String newStroke) {
		stroke = newStroke;
		return this;
	}
	
	public Path fill(String newFill) {
		fill = newFill;
		return this;
	}
	
	public static void main(String[] args) {
		//  <path d="M 132 410 L 132 440 L 160.63 440" fill="none" stroke="#000000" stroke-miterlimit="10"
		//          pointer-events="stroke"/>
		
		Path path = new Path();
		path.moveto(132, 410)
				.lineto(132, 440)
				.lineto(160.63, 440)
				.stroke_("#ababab")
				.fill("none");
		System.out.println(path.render());
	}
}
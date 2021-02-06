package musta.belmo.svg.shapes;

import java.util.Optional;

public class SVGShape {
	protected String fill = "none";
	protected String stroke = "#000000";
	
	public Optional<? extends SVGShape> stroke(String stroke) {
		setStroke(stroke);
		return Optional.of(this);
	}
	
	public void setFill(String fill) {
		this.fill = fill;
	}
	
	public String getFill() {
		return fill;
	}
	
	public void setStroke(String stroke) {
		this.stroke = stroke;
	}
	
	public String getStroke() {
		return stroke;
	}
	
	public String fillAndStroke() {
		return " fill=\"" + fill + '\"' +
				" stroke=\"" + stroke + "\" ";
	}
}

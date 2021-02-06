package musta.belmo.svg;

import com.github.javaparser.Position;
import com.github.javaparser.utils.Utils;




public class SVGSourcePrinter  {
	private final String indentation;
	private final int indentationLength;
	private final String endOfLineCharacter;
	private int level = 0;
	private boolean indented = false;
	private final StringBuilder buf = new StringBuilder();
	private Position cursor = new Position(1, 0);
	
	SVGSourcePrinter(final String indentation, final String endOfLineCharacter) {
		this.indentation = indentation;
		this.indentationLength = indentation.length();
		this.endOfLineCharacter = endOfLineCharacter;
	}
	
	public SVGSourcePrinter indent() {
		++this.level;
		return this;
	}
	
	public SVGSourcePrinter unindent() {
		--this.level;
		return this;
	}
	
	private void makeIndent() {
		for(int i = 0; i < this.level; ++i) {
			this.buf.append(this.indentation);
			this.cursor = Position.pos(this.cursor.line, this.cursor.column + this.indentationLength);
		}
		
	}
	
	public SVGSourcePrinter print(final String arg) {
		if (!this.indented) {
			this.makeIndent();
			this.indented = true;
		}
		
		this.buf.append(arg);
		this.cursor = Position.pos(this.cursor.line, this.cursor.column + arg.length());
		return this;
	}
	
	public SVGSourcePrinter println(final String arg) {
		this.print(arg);
		this.println();
		return this;
	}
	
	public SVGSourcePrinter println() {
		this.buf.append(this.endOfLineCharacter);
		this.cursor = Position.pos(this.cursor.line + 1, 0);
		this.indented = false;
		return this;
	}
	
	public Position getCursor() {
		return this.cursor;
	}
	
	public void wrapToColumn(int column) {
		this.println();
		if (!this.indented) {
			this.makeIndent();
			this.indented = true;
		}
		
		while(this.cursor.column < column) {
			this.print(" ");
		}
		
	}
	
	public String getSource() {
		return this.buf.toString();
	}
	
	public String toString() {
		return this.getSource();
	}
	
	public String normalizeEolInTextBlock(String content) {
		return Utils.normalizeEolInTextBlock(content, this.endOfLineCharacter);
	}
}

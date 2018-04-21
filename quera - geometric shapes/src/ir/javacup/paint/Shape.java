package ir.javacup.paint;


public class Shape {
	Color color;
	Pattern pattern;

	public Shape(Color c, Pattern p) {
		this.color = c;
		this.pattern = p;
	}

	@Override
	public String toString() {
		return "[" +
				"color:" + color +
				", pattern:" + pattern +
				',';
	}
}

enum Color {
	BLUE, GREEN, RED
}

enum Pattern {
	DOTTED, STRIPED, ZIGZAG
}

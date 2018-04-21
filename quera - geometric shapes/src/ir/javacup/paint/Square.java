package ir.javacup.paint;


public class Square extends Shape {

    Integer length;

    public Square(Color c, Pattern p, int length) {
        super(c, p);
        this.length = length; // autoboxing

    }

    @Override
    public String toString() {
        return String.format("%s%s %s:%d]", "Square", super.toString(), "length", length);
    }

    public boolean equals(Square square) {
        if (this == null || square == null || this.color == null || square.color == null ||
                this.length == null || square.length == null ||
                this.pattern == null || square.pattern == null)
            return false;
        if (this.color.equals(square.color) && this.length.equals(square.length) && this.pattern.equals(square.pattern))
            return true;
        return false;
    }
}

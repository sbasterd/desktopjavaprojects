package ir.javacup.paint;

public class Circle extends Shape {
    Double redius;

    public Circle(Color c, Pattern p, double r) {
        super(c, p);
        this.redius = r;
    }

    @Override
    public String toString() {
        return String.format("%s%s %s:%.0f]", "Circle", super.toString(), "redius", redius);
    }


    public boolean equals(Circle circle) {
        if (this == null || circle == null || this.color == null || circle.color == null ||
                this.redius == null || circle.redius == null ||
                this.pattern == null || circle.pattern == null)
            return false;
            if (this.color.equals(circle.color) && this.redius.equals(circle.redius) && this.pattern.equals(circle.pattern))
                return true;
        return false;
    }




}

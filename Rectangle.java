// A Rectangle class

import org.w3c.dom.css.Rect;

public class Rectangle {
    
    // 4 instance attributes
    public double width;
    public double height;
    public double originX = 0.0;
    public double originY = 0.0;
    
    // 1 static attributes
    public static final int NUMBER_OF_SIDES = 4;
    
    // main constructor
    public Rectangle(double width, double height, double originX, double originY) {
        this.width = width;
        this.height = height;
        this.originX = originX;
        this.originY = originY;
    }
    
    // second constructor: 
    public Rectangle(double width, double height) {
        this(width, height, 0, 0);
    }

    // third constructor:
    public Rectangle() {
        this(1, 1, 0, 0);
    }
    
    // method: move the rectangle
    public void move(double dx, double dy) {
        originX += dx;
        originY += dy;
    }
    
    // method: compute the area of the rectangle
    public double getArea() {
        return width * height;
    }
    
    // method: compute the area of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public void scale(double scaleX, double scaleY) {
        width *= scaleX;
        height *= scaleY;
    }

    public void scale(double scale) {
        width *= scale;
        height *= scale;
    }

    public boolean isOverlappedWith(Rectangle r) {
        double rLeft = r.originX;
        double rRight = r.originX + r.width;
        double rTop = r.originY;
        double rBottom = r.originY + r.height;
        double thisLeft = this.originX;
        double thisRight = this.originX + this.width;
        double thisTop = this.originY;
        double thisBottom = this.originY + this.height;

        boolean isOverlappedLeft = rLeft >= thisLeft && rLeft <= thisRight;
        boolean isOverlappedRight = rRight >= thisLeft && rRight <= thisRight;
        boolean isOverlappedTop = rTop >= thisTop && rTop <= thisBottom;        
        boolean isOverlappedBottom = rBottom >= thisTop && rBottom <= thisBottom;

        boolean isFullyInside = (rLeft < thisLeft) && (rRight > thisRight) && (rTop < thisTop) && (rBottom > thisBottom);

        boolean isOverlapped = ((isOverlappedLeft || isOverlappedRight) && (isOverlappedTop || isOverlappedBottom)) || isFullyInside;

        return isOverlapped;
    }

    public static boolean areOverlapping(Rectangle r1, Rectangle r2){
        return r1.isOverlappedWith(r2);
    }

    public double calcRatio(){
        return this.width / this.height;
    }

    public boolean isSquare(){
        final int SQUARE_RATIO = 1;
        final double EPSILON = 0.001;

        return Math.abs(SQUARE_RATIO - this.calcRatio()) < EPSILON;
    }
}

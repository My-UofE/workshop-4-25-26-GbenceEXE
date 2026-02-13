// An application to create and manipulate circles
public class CircleApp {
    // To be executable, need a main method
    public static void main(String[] args) {
        System.out.println("Creating myCircle1");
        
        Circle myCircle1; // myCircle1 is not instantiated
        myCircle1 = new Circle(10.0, 30, 30); // instantiated
        
        // instance fields
        System.out.println("Radius: " + myCircle1.getRadius());
        System.out.println("Origin is: " + myCircle1.getOriginX() + "," + myCircle1.getOriginY());
        // calling methods
        System.out.println("Area: " + myCircle1.getArea());
        System.out.println("Circumference: " + myCircle1.getCircumference());
        
        System.out.println("\nMoving myCircle1");
        myCircle1.move(0, 10); // the object's state is changed
        System.out.println("Origin is: " + myCircle1.getOriginX() + "," + myCircle1.getOriginY());
        
        System.out.println("Changing radius of myCircle1");
        myCircle1.setRadius(8); // the object's state is changed
        System.out.println("Radius: " + myCircle1.getRadius());
        
        
        System.out.println();
        System.out.println("Creating myCircle2");
        Circle myCircle2 = new Circle(10.0);
        System.out.println("Radius: " + myCircle2.getRadius());
        System.out.println("Origin: " + myCircle2.getOriginX() + "," + myCircle2.getOriginY());
        
        
        System.out.println();
        System.out.println("Creating myCircle3");
        Circle myCircle3 = new Circle();
        System.out.println("Radius: " + myCircle3.getRadius());
        System.out.println("Origin: " + myCircle3.getOriginX() + "," + myCircle3.getOriginY());
        
        
        System.out.println();
        System.out.println("1: Radius: " + myCircle1.getRadius());
        myCircle1.scale(0.5); // applies 0.5 scale to radius, changing radius to 4
        System.out.println("1: Radius: " + myCircle1.getRadius());
        
        System.out.println("2: Radius: " + myCircle2.getRadius());
        myCircle2.scale(3); // should change radius to 30
        System.out.println("2: Radius: " + myCircle2.getRadius());
        
        System.out.println("3: Radius: " + myCircle3.getRadius());
        myCircle3.scale(15); // should scale to radius 15
        System.out.println("3: Radius: " + myCircle3.getRadius());
        
        
        System.out.println();
        Circle myCircle4 = new Circle(15.0, 10, 10);
        Circle myCircle5 = new Circle(25.0, 0, 0);
        Circle myCircle6 = new Circle(10.0, 500, 500);
        
        // myCircle4 overlaps myCircle5 so these should show as true
        System.out.println("myCircle4 overlaps myCircle5: " + myCircle4.isOverlappedWith(myCircle5));
        System.out.println("myCircle5 overlaps myCircle4: " + myCircle5.isOverlappedWith(myCircle4));
        
        // myCircle4 does not overlap myCircle6 so these should show as false
        System.out.println("myCircle4 overlaps myCircle6: " + myCircle4.isOverlappedWith(myCircle6));
        System.out.println("myCircle6 overlaps myCircle4: " + myCircle6.isOverlappedWith(myCircle4));
        
        
        System.out.println();
        System.out.println("Testing isEnclosedBy method");
        Circle myCircle7 = new Circle(5.0, 10, 10);
        Circle myCircle8 = new Circle(20.0, 10, 10);
        
        // myCircle7 is enclosed by myCircle8
        System.out.println("myCircle7 enclosed by myCircle8: " + myCircle7.isEnclosedBy(myCircle8));
        System.out.println("myCircle8 enclosed by myCircle7: " + myCircle8.isEnclosedBy(myCircle7));
        
        
        System.out.println();
        System.out.println("Check class prevents negative radius");
        
        // initialise circle for test
        Circle myCircle9 = new Circle(15.0, 10, 10);
        System.out.println("Radius: " + myCircle9.getRadius());
        
        // change to positive radius should be allowed
        myCircle9.setRadius(20);
        System.out.println("Radius: " + myCircle9.getRadius());
        
        // change to negative radius should be ignored
        myCircle9.setRadius(-10);
        System.out.println("Radius: " + myCircle9.getRadius());
    }
}
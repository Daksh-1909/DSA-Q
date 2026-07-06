
public class AreaOfShape {
    public void Area(double radius) {
        System.out.println("Area of Circle: "+(3.14*radius*radius));
    }
    public void Area(int length, int width) {
        System.out.println("Area of Rectangle: "+(length*width));
    }
    public void Area(double length, double width) {
        System.out.println("Area of Triangle: "+(0.5*length*width));
    }
    public void Area(int length, int width, int height) {
        System.out.println("Area of Cube: "+(2*(length*width + width*height + length*height)));
    }
    public void Area(int side) {
        System.out.println("Area of Square: "+(side*side));
    }

    public static void main(String[] args) {
        AreaOfShape shape = new AreaOfShape();
        shape.Area(7.4); 
        shape.Area(10, 4); 
        shape.Area(5.2, 4.3);
        shape.Area(6, 4, 5); 
        shape.Area(6);
    }
}


// 11th prg
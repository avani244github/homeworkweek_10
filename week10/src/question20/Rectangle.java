package question20;
/*The Swimming Company has asked you to write an application that calculatesthe volume of cuboid
shaped pools.
1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
width and length both of type double.
The class needsto have one constructor with parameters width and length both of type double and it
needs to initialize the fields.

In case the width parameter is lessthan 0 it needs to set the width field value to 0.
In case the length parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getWidth without any parameters, it needsto return the value of the width
field.
● Method named getLength without any parameters, it needsto return the value ofthe length
field.
● Method named getArea without any parameters, it needsto return the calculated area
(width * length).
*/

public class Rectangle {
    double width;
    double length;
    public Rectangle(double width,double length){
        this.width = (width < 0)? 0 : width;
        this.length = (length < 0)? 0 : length;

    }
    public double getWidth(){
       return width;
    }
    public double getLength(){
       return length;
    }
public double getArea(){
        double area = (width*length);
return area;
}
    public static void main(String[] args) {
        Rectangle m = new Rectangle(5,10);
        System.out.println(m.getWidth());
        System.out.println(m.getLength());
        System.out.println(m.getArea());
    }
}

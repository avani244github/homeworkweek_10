package question19;

/*1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
of type double.
The class needsto have one constructor with parameter radius of type double and it needsto initialize
the fields.
In case the radius parameter islessthan 0 it needsto set the radiusfield value to 0.
Write the following methods (instance methods):
● Method named getRadius without any parameters, it needsto return the value of the radius
field.
● Method named getArea without any parameters, it needsto return the calculated area
(radius * radius * PI). For PI use Math.PI constant.*/
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = (radius * radius * Math.PI);
        return area;
    }
}

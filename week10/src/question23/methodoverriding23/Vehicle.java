/*Example of method overriding (Create package name ‘methodoverriding23’ and
create all below classes in this package)
class Vehicle{
//defining a method
Public void run(){System.out.println("Vehicle is running");}}
//Creating a child class
class Bike2 extends Vehicle{
//defining the same method as in the parent class
public void run(){System.out.println("Bike is running safely");}
public static void main(String args[]){
Bike2 obj = new Bike2();//creating object
obj.run();//calling method}}*/
package question23.methodoverriding23;

public class Vehicle {
    public void run(){
        System.out.println("Vehicle is running");
    }
}

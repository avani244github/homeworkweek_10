/*26. Encapsulations example (Create package name ‘encapsulation26’ and create all
below classes in this package)
public class Encapsulate {
// private variables declared these can only be
accessed by public methods of class
private String name; 111 Karan 0 222 Aryan 25
private int rollNo; private int age;
// get method for name to access private variable name
public String getName() { return name;}
// set method for name to access private variable name
public void setName(String name) {
this.name = name; }
// get method for roll to access private variable rollNo
public int getRollNo() { return rollNo;}
// set method for roll to access private variable rollNo
public void setRollNo(int rollNo) {
this.rollNo = rollNo;}
// get method for age to access private variable age
public int getAge() { return age;}
// set method for age to access private variable age
public void setAge(int age) {
this.age = age;} public class TestEncapsulation {
public static void main(String[] args) {
Encapsulate obj = new Encapsulate();
// setting values of the variables obj.setName("Bhavesh");obj.setAge(19); obj.setRollNo(51);
// Displaying values of the variables
System.out.println("CodeBusters name: " +obj.getName());
System.out.println("CodeBuster age: " +obj.getAge());
System.out.println("CodeBuster rollNo: " +obj.getRollNo());
// Direct access of rollNo is not possible due toencapsulation
// System.out.println("CodeBuster rollNo :" +obj.geekName);*/
package question26;

public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            obj.setName("Bhavesh");
            obj.setAge(19);
            obj.setRollNo(51);
            System.out.println("CodeBusters name: " + obj.getName());
            System.out.println("CodeBuster age: " + obj.getAge());
            System.out.println("CodeBuster rollNo: " + obj.getRollNo());


        }
    }
}

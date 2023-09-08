abstract class Inform {
 abstract void printInfo();
}
 
// Abstraction performed using extends
class Employee extends Inform{
 void printInfo() {
 String name = "Sandhya";
 int age = 21;
 float salary = 222.2F;
 
 System.out.println(name);
 System.out.println(age);
 System.out.println(salary);
 
 }
 
}
 
// Base class
class Base {
 public static void main(String args[]) {
 Inform s = new Employee();
 s.printInfo();
 }
}
class Vehicle
{ 
 void run()
 {
 System.out.println("Vehicle is running");
 } 
 
 void run(int number)
 {
 System.out.println("Bike number is "+number);
 }
 } 

class Bike2 extends Vehicle
{ 

 void run()
 {
 System.out.println("Bike is running safely");
 } 
 
 public static void main(String args[])
{ 
 Vehicle obj = new Bike2();//creating object 
 obj.run();//calling method 
 obj.run(9898);
 } 
}

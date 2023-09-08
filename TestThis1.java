class Student
{
  int rollno; 
  String name;
  int year;
  Student(int rollno,String name,int year)
 {
   this.rollno=rollno;
   this.name=name;
   this.year=year;
  }
void display()
 {
   System.out.println(rollno+" "+name+" "+year);
  }
}
class TestThis1
{
 public static void main(String args[])
 {
  Student s1=new Student(111,"ankit",2);
  Student s2=new Student(112,"Sumit",3);
  s1.display();
  s2.display();
 }
}

package io.oop.classes;



public class Student {

      //instance variables (properties of the class object)
      String name;
      int age;
      String address;

      //a constructor of the class
      public Student(String name, int age, String address){
                  this.name = name;
                  this.age = age;
                  this.address = address;
      }

      //setter methods
      public void setName(String name){
            this.name = name;
      }

      public void setAge(int age){
            this.age = age;
      }

      public void setAddress(String address){
            this.address = address;
      }

      //getter methods
       public String getName(){
            return name;
      }

      public int getAge(){
            return age;
      }

      public String getAddress(){
            return address;
      }


      //@Override
      // Public  String toString(){

      //       String ans = "Name:"+ this.getName() +
      //                    "Age:" + this.getAge() +
      //                    "Adress" + this.getAddress();
      //       return ans;
                  
      // }
      
      //main method
      public static void main(String[] args) {
            Student student = new Student("Alidante", 20, "29, Mazeras");
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());
      }

      
}

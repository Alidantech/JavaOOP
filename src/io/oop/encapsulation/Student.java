package io.oop.encapsulation;

public class Student {

      // use the private properties for Encapsulation
      private String name;
      private int age;
      private String address;

      public Student(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
      }

      // setter methods
      public void setName(String name) {
            this.name = name;
      }

      public void setAge(int age) {
            this.age = age;
      }

      public void setAddress(String address) {
            this.address = address;
      }

      // getter methods
      public String getName() {
            return name;
      }

      public int getAge() {
            return age;
      }

      public String getAddress() {
            return address;
      }

}

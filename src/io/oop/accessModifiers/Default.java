package io.oop.accessModifiers;

class Default {

      public void display1(){
            System.out.println("You accessed a public method");
      }

       protected void display3(){
            System.out.println("You accessed a protected method");
      }
      
      void display2(){
            System.out.println("You accessed a default method");
      }

      private void display4(){
            System.out.println("You accessed a private method");
      }

      public void display(){
            display4();
      }
}

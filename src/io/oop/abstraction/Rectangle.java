package io.oop.abstraction;

public class Rectangle extends GraphicObject{
      
      @Override
      void draw() {
            System.out.println("Draw a Rectangle");
      }

      @Override
      void resize() {
            System.out.println("Resize the Rectangle");
      }

}

package io.oop.abstraction;

public class MainAbstraction {
      
      public static void main(){
            GraphicObject circle  = new Circle();
            circle.draw();
            circle.resize();

            GraphicObject rectangle  = new Rectangle();
            rectangle.draw();
            rectangle.resize();

      }
}

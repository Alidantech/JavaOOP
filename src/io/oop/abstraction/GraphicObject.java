package io.oop.abstraction;

public abstract class GraphicObject {
      
      int x, y;

      void moveTo(int newX, int newY){
            System.out.println("move to: new x = "+x +" y = "+ y);
      }

      abstract void draw();
      abstract void resize();
}

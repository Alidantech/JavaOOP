package io.oop.inheritance;

class Bicycle {

      public int gear;
      public int speed;

      public Bicycle(int gear, int speed){
            this.gear = gear;
            this.speed = speed;
      }

      public void setGear(int gear){
            this.gear = gear;
      }

      public void setSpeed(int gear){
            this.gear = gear;
      }

      public int getGear(){
            return this.gear;
      }

      public int getSpeed(){
            return this.gear;
      }

      public void applyBreak(int decrement){
            this.speed -= decrement;
      }

      public void speedUp(int increment){
            this.speed += increment;
      }

}


package io.oop.interfaces;

public class MountainBike implements Bicycle {
      int seatHeight;
      int startGear; 
      int startSpeed;

      public MountainBike(int startGear, int startSpeed, int startHeight){

            this.seatHeight = startHeight;
            this.startGear = startGear;
            this.startSpeed = startSpeed;

      }

      public void setHeight(int seatHeight) {

            this.seatHeight = seatHeight;

      }

      public int getHeight() {

            return this.seatHeight;

      }

      @Override
      public void applyBreak(int decrement) {
            this.startSpeed -= decrement;
      }

      @Override
      public void speedUp(int increment) {
            this.startSpeed += increment;
      }

}

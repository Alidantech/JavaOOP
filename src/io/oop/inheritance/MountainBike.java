package io.oop.inheritance;

public class MountainBike extends Bicycle {
      public int seatHeight;

      public MountainBike(int startGear, int startSpeed, int startHeight){

            super(startGear, startSpeed);
            this.seatHeight = startHeight;

      }

      public void setHeight(int seatHeight) {

            this.seatHeight = seatHeight;

      }

      public int getHeight() {

            return this.seatHeight;

      }

}

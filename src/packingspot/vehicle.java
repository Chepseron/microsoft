package packingspot;

// Vehicle and its inherited classes.

import java.util.ArrayList;

public enum Vehicle { Motorcycle, Compact,Large };
  
public abstract class Vehicle
{
      protected ArrayList<ParkingSpot> parkingSpots =
                           new ArrayList<ParkingSpot>();
      protected String licensePlate;
      protected int spotsNeeded;
      protected Vehicle size;
  
      public int getSpotsNeeded()
      {
          return spotsNeeded;
      }
      public Vehicle getSize()
      {
          return size;
      }
  
      /* Park vehicle in this spot (among others,
         potentially) */
      public void parkinSpot(ParkingSpot s)
      {
          parkingSpots.add(s);
      }
  
  
      /* Remove vehicle from spot, and notify spot
         that it's gone */
      public void clearSpots() { ... }
  
      /* Checks if the spot is big enough for the
         vehicle (and is available).
         This * compares the SIZE only.It does not
        check if it has enough spots. */
      public abstract boolean canFitinSpot(ParkingSpot spot);
}
  
public class Bus extends Vehicle
{
    public Bus()
    {
        spotsNeeded = 5;
        size = Vehicle.Large;
    }
  
    /* Checks if the spot is a Large. Doesn't check
     num of spots */
    public boolean canFitinSpot(ParkingSpot spot) 
    {
    
    
    }
}
  
public class Car extends Vehicle
{
    public Car()
    {
        spotsNeeded = 1;
        size = Vehicle.Compact;
    }
  
    /* Checks if the spot is a Compact or a Large. */
    public boolean canFitinSpot(ParkingSpot spot) 
    { ... }
}
  
public class Motorcycle extends Vehicle
{
    public Motorcycle()
    {
        spotsNeeded = 1;
        size = Vehicle.Motorcycle;
    }
    public boolean canFitinSpot(ParkingSpot spot) 
    { ... }
}
  
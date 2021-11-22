package unit2.Vehicle;

//Create a public class named Car that extends Vehicle class
public class Car extends Vehicle{
    
    //declare integer variables mileage and distanceThisSession
    int mileage;
    int distanceThisSession;

    // Create Car method with parameters :numWheels (int), mileage (int), and distanceThisSession
    public Car(int numWheels, int mileage, int distanceThisSession) {
        super(numWheels);
        this.mileage = mileage;
        this.distanceThisSession = distanceThisSession;
    }
       
    //Create another Car method with parameters numWheels, colour, placeofProduction, speed, mileage and distanceThisSession
    public Car(int numWheels, String colour, String placeOfProduction, int speed, int, mileage, int distanceThisSession) {
        super(numWheels, colour, placeOfProduction, speed);
        this.mileage = mileage;
        this.distanceThisSession = distanceThisSession;
    }
       
    

    // Create a method to set the mileage
      // setter function used when we want to update values
    public void setMileage() {
        mileage += distanceThisSession;
    }
        
    

}
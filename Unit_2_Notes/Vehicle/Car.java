package Unit_2_Notes.Vehicle;

public class Car extends Vehicle{
    
    //declar integer variables mileage and distanceThisSession
    

    
    public Car(int numWheels, int mileage, int distanceThisSession) {
        super(numWheels);
        this.mileage = mileage;
        this.distanceThisSession = distanceThisSession;
    }

    public Car(int numWheels, String colour, String placeOfProduction, int speed, int mileage, int distanceThisSession) {
        super(numWheels, colour, placeOfProduction, speed);
        this.mileage = mileage;
        this.distanceThisSession = distanceThisSession;
    }

    // Create a function to set the mileage
    public void setMileage() { // setter function used when we want to update values
        mileage += distanceThisSession;
    }

}
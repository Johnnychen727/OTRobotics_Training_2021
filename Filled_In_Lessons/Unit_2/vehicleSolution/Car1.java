package Filled_In_Lessons.Unit_2.vehicleSolution;
//import Vehicle;

public class Car1 extends Vehicle{
    int mileage1;
    int distanceThisSession;

    public Car1(int numWheels, int mileage, int distanceThisSession) {
        super(numWheels);
        this.mileage1 = mileage;
        this.distanceThisSession = distanceThisSession;
    }

    public Car1(int numWheels, String colour, String placeOfProduction, int speed, int mileage, int distanceThisSession) {
        super(numWheels, colour, placeOfProduction, speed);
        this.mileage1 = mileage;
        this.distanceThisSession = distanceThisSession;
    }

    public void setMileage() { // setter function used when we want to update values
        mileage1 += distanceThisSession;
    }

}
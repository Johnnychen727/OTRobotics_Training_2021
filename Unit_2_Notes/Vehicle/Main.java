package Unit_2_Notes.Vehicle;

public class Main {
        
        public static void main(String[] args) {
        
        //Create new vehicle
        Vehicle vehicle = new Vehicle(6);
        //increase the speed of the vehicle
        vehicle.increaseSpeed();
        //save the current speed as a variable
        int currentSpeed = vehicle.getSpeed();
        //print the current speed
        System.out.println(currentSpeed);

        //Create new variable named vehicle two
        Vehicle vehicle2 = new Vehicle(4, "red", "Oakville", 20);
        
        //Print colour of vehicle two
        System.out.println(vehicle2.colour);
        
        // Create new car
        Car car = new Car(4, 0, 10);
        //Set mileage of new car
        car.setMileage();
        //Print the cars mileage
        System.out.println(car.mileage);
    }
}

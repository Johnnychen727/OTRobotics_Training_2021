package unit2.Vehicle;

public class Main {
        
        public static void main(String[] args) {
        
        //Create new vehicle object with arguments of 6
            Vehicle vehicle = new Vehicle(6);
        //increase the speed of this vehicle
            vehicle.increaseSpeed();
       
        //save the current speed of vehicle as a variable
            int currentSpeed = vehicle.getSpeed();

        //print the current speed
            System.out.println(currentSpeed);

        //Create another object named vehicle2 from Vehicle Class with arguments 4, "red", "Oakville", and 20
            Vehicle vehicle2 = new Vehicle(4, "red", "Oakville", 20);
        
        //Print colour of vehicle two
            System.out.println(vehicle2.colour);
        
        // Create new car object from car class with arguments 4, 0, 10
            Car car = new Car(4, 0, 10);

        //Set mileage of new car
            car.setMileage();
        //Print the cars mileage
            System.out.println(car.mileage);
    }
}

package Filled_In_Lessons.Unit_2.vehicleSolution;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(6);
        vehicle.increaseSpeed();
        int currentSpeed = vehicle.getSpeed();
        System.out.println(currentSpeed);

        Vehicle vehicle2 = new Vehicle(4, "red", "Oakville", 20);
        System.out.println(vehicle2.colour);

        Car1 car = new Car(4, 0, 10);
        car.setMileage();
        System.out.println(car.mileage1);
    }
}

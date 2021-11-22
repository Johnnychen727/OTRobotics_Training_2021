package unit2.Vehicle;

//create public class named vehicle

    //create public variables number of wheels (integer), colours (string), placeofproduction(string), speed (int)
    public class Vehicle {
        public int numWheels;
        public String colour;
        public String placeOfProduction;
        public int speed;
    }




    //create public vehicle method that takes number of wheels variable
    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    //Create method named vehicle that takes arguments, numWheels, colour, placeOfProduction, and speed
    public Vehicle(int numWheels, String colour, String placeOfProduction, int speed) {
        this.numWheels = numWheels;
        this.colour = colour;
        this.placeOfProduction = placeOfProduction;
        this.speed = speed;
    }
        
    
    
    // create method to get speed
    public int getSpeed() {
        return speed;
    }

    //create method to increase speed
    public void increaseSpeed() {
        speed++;
    }
        
    

    //create a method to decrease speed
    public void decreaseSPeed() {
        speed--;
    }
    
    
//}

package Unit_2_Notes.Vehicle;

//create public class named vehicle

    //create public variables number of wheels (integer), colours (string), placeofproduction(string), speed (int)
    




    //create public vehicle method that takes number of wheels variable
    

    //Create object template named vehicle that takes arguments, numWheels, colour, placeOfProduction, and speed
    public Vehicle(int numWheels, String colour, String placeOfProduction, int speed) {
        this.numWheels = numWheels;
        this.colour = colour;
        this.placeOfProduction = placeOfProduction;
        this.speed = speed;
    }
    
    // create a function to get speed
    public int getSpeed() {
        return speed;
    }

    //create function to increase speed
    public void increaseSpeed() {
        speed++;
    }

    //create a function to decrease speed
    public void decreaseSpeed() {
        speed--;
    }

}

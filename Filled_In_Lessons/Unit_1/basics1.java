package Unit_1;

public class basics1{
    public static void main(String[] args) {

        // Declaring variables: type name = value;
        int x = 1;
        int y = 2;
        int z = 3;

        int perimeter = x + y + z;
        System.out.println("The perimeter of the triangle is: " + perimeter);

        /* Comparing side lengths x and y using if/else statements:
            if (condition) {
                do stuff
            }
        */
        if (x > y) {
            System.out.println("Side x is longer.");
        } else if (x == y) {
            System.out.println("They are the same length.");
        } else {
            System.out.println("Side y is longer.");
        }
        
        // Using a built-in method
        String name = "your name";
        int length = name.length();

        System.out.println("The length of your name is" + length + "letters.");
    }

}
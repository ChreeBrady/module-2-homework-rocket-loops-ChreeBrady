// Chretien Brady
// CPW 140
// Assignment #2
//
// This program will make a rocket ship based on the inputted Rocket size integer.

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket. 
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {
        // makes the number of rows depending on rocket size
        int rows = 2 * ROCKET_SIZE - 1;

        //  loop through total amount of rows for the nose cone; Rows = (Rocket_size * 2) - 1
        for(int size = 1; size <= rows; size++){
        
            // print lead spaces
            for(int space = 1; space <= (2 * ROCKET_SIZE) - size; space++){
                System.out.print(" ");
            }

            // print left side of nose
            for(int left = 1; left <= size; left++) {
                System.out.print("/");
            }

            // print ** for middle of nose
            System.out.print("**");

            // print right side of nose
            for(int left = 1; left <= size; left++) {
                System.out.print("\\");
            }

            System.out.println();

            }
    }
    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        for (int size = 1; size <= ROCKET_SIZE; size++) {
            System.out.print("|");

            // prints leading dots
            for(int dots = 1; dots <= ROCKET_SIZE - size; dots++) {
                System.out.print(".");
            }

            // prints the left diamond
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print("/");
            }
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print("\\");
            }

            // prints middle dots
            for(int dots = 1; dots <= ROCKET_SIZE - size; dots++) {
                System.out.print("..");
            }

             // prints right diamond
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print("/");
            }
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print("\\");
            }

            // Prints trailing dots
            for(int dots = 1; dots <= ROCKET_SIZE - size; dots++) {
                System.out.print(".");
            }
            // ends line with | and moves to the next line
            System.out.println("|");
        }
    }
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        for(int size = ROCKET_SIZE; size >= 1; size--) {
            System.out.print("|");
            
            //leading dots
            for (int dots = 1; dots <= ROCKET_SIZE - size; dots++) {
                System.out.print(".");
            }

            // left diamond 
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print('\\');
            }
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print('/');
            }

            // middle dots
            for(int dots = 1; dots <= ROCKET_SIZE - size; dots++) {
                System.out.print("..");
            }

            //right diamond 
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print('\\');
            }
            for (int diamond = 1; diamond <= size; diamond++) {
                System.out.print('/');
            }

            //trailing dots
            for (int dots = 1; dots <= ROCKET_SIZE - size; dots++) {
                System.out.print(".");
            }

            // end line and begin new one
            System.out.println("|");
        }
    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        // starts edge pattern
        System.out.print("+");

        // repeats edge pattern
        for(int pattern = 1; pattern <= ROCKET_SIZE; pattern++) {
            System.out.print("=*=*");
        }
        
        // ends edge pattern and starts new line
        System.out.println("+");   

    }
}
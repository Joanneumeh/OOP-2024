package ie.tudublin;

public class Cat {
    private int numLives;

    // Constructor
    public Cat() {
        this.numLives = 9;
    }

    // Public accessor for numLives field
    public int getNumLives() {
        return numLives;
    }

    // Method to decrement numLives and print messages
    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!");
        } else {
            System.out.println("Dead");
        }
    }

    public static void main(String[] args) {
        // Creating a new instance of the Cat class
        Cat ginger = new Cat();

        // Loop to call kill on ginger until ginger is dead
        while (ginger.getNumLives() > 0) {
            ginger.kill();
        }
    }
}

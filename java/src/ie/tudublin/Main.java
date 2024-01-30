// Packages must match the folder structure
package ie.tudublin;

public class Main
{

    public void helloProcessing()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

    public void doDogStuff()
    {
        // Create a new Dog called Misty
        // Call the constructor
        Dog misty = new Dog("Misty");
        misty.speak();

        Dog lucy = new Dog("Lucy");
        lucy.speak();
    }

    public void doCatStuff()
    {
        // Create a new Cat called Ginger
        // Call the constructor
        Cat ginger = new Cat();

        // Access the number of lives using the getter method
        System.out.println("Initial number of lives for Ginger: " + ginger.getNumLives());

        // Call the kill method on Ginger until it's dead
        while (ginger.getNumLives() > 0) {
            ginger.kill();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Main m = new Main();

        m.doDogStuff();

        m.doCatStuff();

        m.helloProcessing();
    }

}

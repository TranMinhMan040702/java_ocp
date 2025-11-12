package pond.swan;
import pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(txt);
    }

    public void helpOtherSwanSwim() {
        Swan swan = new Swan();
        swan.floatInWater();
        System.out.println(swan.txt);
    }

    public void helpOtherBirdSwim() {
        Bird bird = new Bird();
        bird.floatInWater();                // does not compile
        System.out.println(bird.txt);       // does not compile
    }
    /*
        - Protected access
        - Allowed in subclass (even different package) only on objects of the subclass type, or via inheritance on this
        - Not allowed on other instances of the parent class from a different package
    */
}
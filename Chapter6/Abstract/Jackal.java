/**
 * Example: Abstract class
 */

public class Jackal extends Canine {

    /**
     * does not compile, because the jackal class is not abstract class so can con contain the abstract method
     */
    public abstract void rest();

    public String getSound() {
        return "Jackkkkk";
    }
}
/**
 * Example: Abstract class
 */

public class Direwolf extends Canine {

    /**
     * does not compile, because the variables can not be mark abstract
     */
    public abstract String name;

    public String getSound() {
        return "Wolf....";
    }
}
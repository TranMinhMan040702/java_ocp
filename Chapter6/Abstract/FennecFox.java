/**
 * Example: Abstract class
 */

public class FennecFox extends Canine {

    /**
     * does not compile, because the return type are not covariant
     */
    public int getSound() {
        return 1;
    }
}
/**
 * Example: Static Interface Methods
 */

public class Skip implements Hop {
    public int skip() {
        
        // does not compile
        // return getJumpHeight();

        // compile
        return Hop.getJumpHeight();
    }
}
/**
 * Example: final Method
 */

class Bird {
    public final boolean hasFeathers() {
        return true;
    }

    public final static void flyAway() {}
}

public class Penguin extends Bird {

    /**
     * the method is marked as final in the parent class, so it cannot override
     */
    public final boolean hasFeathers() {
        return false;
    }

    /**
     * the method is marked as final in the parent class, so it connot hiding
     */
    public final static void flyAway() {}
}
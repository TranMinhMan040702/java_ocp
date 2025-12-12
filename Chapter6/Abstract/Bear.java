/**
 * Example: Creating Constructors in Abstract Classes
 */

public abstract class Bear {
    abstract CharSequence chew();

    public Bear() {
        System.out.println(chew());
    }
}
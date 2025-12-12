/**
 * Example: Default Interface Method
 */

public interface IsColdBlooded {
    boolean hasScales();
    default double getTerature() {
        return 10.0;
    }
}
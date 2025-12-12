/**
 * Example: Default Interface Method
 */

public class Snake implements IsColdBlooded {

    // Required override
    public boolean hasScales() {
        return true;
    }

    // Optional override
    public double getTemperature() {
        return 12;
    }
}
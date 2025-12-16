/**
 * Example: Default Interface Method
 */

public interface IsColdBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
    
    default double getTemperature1() {
        return getTemperature();
    }
}
/**
 * Example: Duplicate default Methods
 */

public interface Walk {
    default int getSpeed() {
        return 5;
    }
}
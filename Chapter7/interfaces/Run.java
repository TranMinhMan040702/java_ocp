/**
 * Example: Duplicate default Methods
 */

public interface Run {
    default int getSpeed() {
        return 10;
    }
}
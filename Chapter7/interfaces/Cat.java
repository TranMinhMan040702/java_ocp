/**
 * Example: Duplicate default Methods
 */

public class Cat implements Walk, Run {

    // Required override
    public int getSpeed() {
        return Run.super.getSpeed();
    }

    // Calling a hidden default Method
    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}
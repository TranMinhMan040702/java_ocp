/**
 * Example: Private Interface Methods
 */

public interface Schedule {
    private static void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have " + (17 - hour) + " hours left to make the appointment");
        }
    }

    private void haveBreakfast() {
        checkTime(9);
    }

    default void wakeUp() {
        checkTime(7);

        // static interface method can only be called by default and other private non-static methods
        haveBreakfast();
    }

    static void workOut() {
        checkTime(18);
    }
}
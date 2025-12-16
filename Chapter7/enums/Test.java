import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Example: The values(), name(), ordinal() methods
        for (Season season : Season.values()) {
            System.out.println(season.name() + ": " + season.ordinal());
        }

        // Example: Calling the valueOf() method
        System.out.println(Season.valueOf("WINTER"));

        // Example: The switch statement
        var s1 = Season.WINTER;
        switch(s1) {
            case WINTER: System.out.println("This is W");
            // case Season.SUMMER: System.out.println("This is S");     // does not compile
            case FALL: System.out.println("This is F");
        }

        // Example: The switch expression
        var s2 = Season.SUMMER;
        var result = switch(s2) {
            case WINTER -> 1;
            // case Season.SUMMER -> 3;     // does not compile
            case FALL -> 2;
            default -> 5;
        };
        System.out.println(result);

        // Example: The constructor in the enum
        System.out.println("first call");
        Color red = Color.RED;
        System.out.println("end call");
        Color blue = Color.BLUE;
        
        // Example: Using methods in the enum
        Season.SUMMER.printExpectedVisitors();
        Season.WINTER.printExpectedVisitors();
    }
}
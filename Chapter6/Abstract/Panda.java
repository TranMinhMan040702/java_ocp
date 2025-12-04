/**
 * Example: Creating Constructors in Abstract Classes
 */

public class Panda extends Bear {
    public String chew() {
        return "Yummy!!!!";
    }

    public static void main(String[] args) {
        Bear p = new Panda();
    }
}
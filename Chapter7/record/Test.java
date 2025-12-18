/**
 * Example: Record
 */

public class Test {
    public static void main(String[] args) {
        var p1 = new People("Male", new Human("Male", 30));
        var p2 = new People("Male", new Human("Male", 30));
        System.out.println(p1);
        System.out.println(p1.equals(p2));      // false

        var o1 = new Order(101, "Processing");
        var o2 = new Order(101, "Processing");
        System.out.println(o1.equals(o2));      // true
    }
}
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

        var pr1 = new Product("shoe", 1);
        System.out.println(pr1);

        var u1 = new User("Tran Man", 23);
        var u2 = new User("Tran", "Man", 23);
        var u3 = new User(24, "Mantm");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u1.equals(u2));
    }
}
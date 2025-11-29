/**
* Example: Initializing Instance
*/

public class Cuttlefish {
    private String name = "swimmy";
    {System.out.println(name);}
    private static int count = 0;
    static {System.out.println(count);}
    {count++; System.out.println(count);}

    public Cuttlefish() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new Cuttlefish();
    }

    // Result:
    // 0
    // Ready
    // swimmy
    // 1
    // Constructor
}
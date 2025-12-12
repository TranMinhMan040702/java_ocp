/*
* Example: Rule2: Access Modifiers in Overriding a Method
*/

class Camel {
    protected int getNumberOfHumps() {
        return 1;
    }
}

public class BactrianCamel extends Camel {
    /*
    * Does not compile, because the access modifier private is more restrictive than the one defined in the method of the parent class
    */
    private int getNumberOfHumps() {
        return 2;
    }

    /*
    * Compile
    */
    public int getNumberOfHumps() {
        return 2;
    }

    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.println(c.getNumberOfHumps());
    }
}
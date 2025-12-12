/**
* Example: Redeclaring private method
*/
class Beetle {
    public String getSize() {
        return "undefined";
    }
}

public class RhinocerosBeetle extends Beetle {
    public int getSize() {
        return 5;
    }

    public static void main(String[] args) {
        var r = new RhinocerosBeetle();
        System.out.println(r.getSize());
    }
}
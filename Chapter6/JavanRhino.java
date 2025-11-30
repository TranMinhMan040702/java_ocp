/*
* Example: Rule 4: Covariant Return Types
*/

class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }

    protected String getColor() {
        return "grey, black";
    }
}

public class JavanRhino extends Rhino {

    /*
    * Compile
    */
    public String getName() {
        return "javan rhino";
    }

    /*
    * Does not compile, because String is not subtype of CharSequence
    */
    public CharSequence getColor() {
        return "grey";
    }
}
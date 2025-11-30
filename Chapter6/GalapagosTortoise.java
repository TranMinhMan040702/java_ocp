/*
* Example: Rule 3: Checked Exceptions
*/
import java.io.*;

class Reptile {
    protected void sleep() throws IOException {}

    protected void hide() {}

    protected void exitShell() throws FileNotFoundException {}
}

public class GalapagosTortoise extends Reptile {

    /*
    * Compile
    */
    public void sleep() throws FileNotFoundException {}

    /*
    * Does not compile, because the method hide in the parent class is not throws exception
    * but the method hide in the child class is new checked exception
    */
    public void hide() throws FileNotFoundException {}

    /*
    * Does not compile, because the IOException exception is broader than the FileNotFoundException exception
    */
    public void exitShell() throws IOException {}
}
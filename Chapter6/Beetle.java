/**
* Example: use keyword this and super
*/

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println(this.label);     // this: includes current and inherited
        System.out.println(super.label);    // super: only includes inherited
        System.out.println(this.age);       // this: includes current and inherited
        System.out.println(super.age);      // does not compile, because the age variable is not in the parent class
        System.out.println(numberOfLegs);   // local variable -> current instance -> inherited
    }

    public static void main(String... args) {
        var b = new Beetle();
        b.printData();
    } 
}
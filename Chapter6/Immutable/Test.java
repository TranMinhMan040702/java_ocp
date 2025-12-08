/**
 * Example: Declaring an Immutable Class
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Example: 4. Don’t allow referenced mutable objects to be modified.
        var animalMuatble = new Animal();
        var f1 = animalMuatble.getFavoriteFoodsMutable();
        f1.clear();
        f1.add("Chocolate...");
        System.out.println(animalMuatble.getFavoriteFoodsMutable());

        var animalImmutable = new Animal();
        var f2 = animalImmutable.getFavoriteFoodsImmutable();
        f2.clear();
        f2.add("Chocolate...");
        System.out.println(animalImmutable.getFavoriteFoodsImmutable());

        // Example: 5. Use a constructor to set all properties of the object, making a copy if needed.
        List<String> nuts = new ArrayList<String>();
        nuts.add("Small");
        var c1 = new Cat(nuts);
        System.out.println(c1.getFavoriteNut());

        nuts.clear();
        nuts.add("Big");
        System.out.println(c1.getFavoriteNut());
    }
}
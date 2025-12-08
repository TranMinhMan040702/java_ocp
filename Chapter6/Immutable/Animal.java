/**
 * Example: Declaring an Immutable Class - 4. Don’t allow referenced mutable objects to be modified.
 */

import java.util.*;

public final class Animal {
    private final List<String> favoriteFoods;

    public Animal() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apple");
    }

    public List<String> getFavoriteFoodsMutable() {
        return favoriteFoods;
    }

    // Copy on Read Accessor Methods
    public List<String> getFavoriteFoodsImmutable() {
        return new ArrayList<String>(this.favoriteFoods);
    }
}
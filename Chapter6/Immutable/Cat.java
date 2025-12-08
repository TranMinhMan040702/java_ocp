/**
 * Example: Declaring an Immutable Class - 5. Use a constructor to set all properties of the object, making a copy if needed.
 */

import java.util.*;

public final class Cat {
    private final List<String> favoriteNuts;

    // Mutable
    // public Cat(List<String> nuts) {
    //     if (nuts == null || nuts.size() == 0)
    //         throw new RuntimeException("favoriteNuts is required");

    //     this.favoriteNuts = nuts;
    // }

    // Immutable
    // a defensive copy
    public Cat(List<String> nuts) {
        if (nuts == null || nuts.size() == 0)
            throw new RuntimeException("favoriteNuts is required");

        this.favoriteNuts = new ArrayList<String>(nuts);
    }

    public List<String> getFavoriteNut() {
        return new ArrayList<>(this.favoriteNuts);
    }
}
/**
 * Example: Overloaded Constructor
 */

public record User(String name, int age) {
    public User(String firstname, String lastname, int age) {
        this(firstname + " " + lastname, age);
        age = 40;       // no effect
    }

    public User(int age, String name) {
        this(name, "USER", age);
    }

    public User {
        name = name.toUpperCase();
    }
}
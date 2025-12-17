public sealed class Animal permits Dog {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
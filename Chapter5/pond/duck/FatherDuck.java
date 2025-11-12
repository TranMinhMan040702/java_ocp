package pond.duck;

public class FatherDuck {
    private String noise = "quack";     // private access modifier

    private void quack() {              // private access modifier
        System.out.println(noise);
    }
}
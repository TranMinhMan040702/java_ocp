
public class Test {
    static {
        System.out.println("Static initializer");
    }
    public static void main(String[] args) {
        Snake snake = new Snake();
    }
}

class Snake {
    static {
        System.out.println("Snake");
    }
}
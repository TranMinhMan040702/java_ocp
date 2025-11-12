package pond.shore;

public class BirdWatcher {
    public void watchBird() {
        var bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.txt);
    }

    public static void main(String[] args) {
        new BirdWatcher().watchBird();
    }
}
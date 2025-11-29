package pond.inland;
import pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        var bird = new Bird();
        bird.floatInWater();                // does not compile
        System.out.println(bird.txt);       // does not compie
    }
}
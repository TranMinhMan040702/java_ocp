package pond.duck;
import pond.goose.Goose;
import pond.shore.Bird;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater();

        // Goose refer to floatInWater(), not callers of Goose
    }
}
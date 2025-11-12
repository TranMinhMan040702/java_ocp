package pond.swan;
import pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();                       // does not compile
        System.out.println(duck.noise);     // does not compile
    }
}
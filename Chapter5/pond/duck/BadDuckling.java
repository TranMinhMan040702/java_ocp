package pond.duck;
import pond.duck.FatherDuck;

public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
        duck.quack();                       // does not compile
        System.out.println(duck.noise);     // does not compile
    }
}
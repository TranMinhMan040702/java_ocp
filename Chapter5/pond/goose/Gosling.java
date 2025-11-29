package pond.goose;
import pond.shore.Bird;

public class Gosling extends Bird {
    {
        txt = "Gosling....";
    }
    public void swim() {
        floatInWater();             // compile
        System.out.print(txt);      // compile
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}
import static zoo.ZooA.type;
import static zoo.ZooB.type;

// Compile error because both variable type in ZooA and variable type in ZooB match
public class BadZooParking {
    public static void main(String[] args) {
        System.out.println("The type of ZooA: " + type);
        System.out.println("The type of ZooB: " + type);
    }
}
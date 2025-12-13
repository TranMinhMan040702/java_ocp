/**
 * Example: Inheriting Duplicate Abstract Methods
 */
 
public class Bear implements Herbivore, Omnivore {
    public Integer eatPlants() {
        System.out.println("Eating plants");
        return 1;
    }
}
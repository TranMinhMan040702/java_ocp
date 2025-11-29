public class Gorilla {
    public static int count;


    public static void addGorilla() {
        count++;
    }


    public void badyGorilla() {
        count++;
    }

    // instance method call static method, and instance method -> ok
    public void announceBabies() {
        addGorilla();
        badyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        badyGorilla();    // Does not compile
    }

    public int total;

    public static double average = total / count;   // Does not compile
}
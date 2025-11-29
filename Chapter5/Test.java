
public class Test {

    public static void main(String[] args) {
        String str = new String("Hello");
        checkEqual(str);
    }

    static void checkEqual(String str1) {
        System.out.println(str1 == "Hello");
    }
}

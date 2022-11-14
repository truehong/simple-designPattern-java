package singleton;

public class HelloWord {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a == b) {
            System.out.println(true);
        }
    }
}
/**
 * 1239731077
 * 1239731077
 * true
 * */

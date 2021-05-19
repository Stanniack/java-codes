package lambdafunctions;

public class Threads {
    public static void main(String[] args) {
        new Thread(
                () -> {
                    System.out.println("Thread iniciada.");
                }
        ).start();

    }
}

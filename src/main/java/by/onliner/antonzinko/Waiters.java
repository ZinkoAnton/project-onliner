package by.onliner.antonzinko;

public class Waiters {

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 2000);
        } catch (Exception e) {

        }
    }
}

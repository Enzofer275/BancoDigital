import java.util.Scanner;

public class GerenciadorScanner {
    private static Scanner scanner;

    private GerenciadorScanner() {
    }

    public static Scanner getScanner() {

        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 numbers : ");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        operations(a, b, c);
    }

    public static void operations(int a, int b, int c) {
        int[] array = {a, b, c};
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int count = 0;
        for (int i = min; i < max; i++) {
            count++;
        }
        System.out.println(count);
    }
}
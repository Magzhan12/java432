import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x >= 0)
            f = Math.sqrt(Math.pow(x, 3) + 5);
        else
            f = 3 * Math.pow(x, 4) + 9;

        System.out.println("f(x) = " + f);
    }
}
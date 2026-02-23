import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (0 <= x && x < 1)
            f = x * Math.pow(Math.cos(x), 2) + Math.sin(x);
        else if (x <= 2)
            f = Math.cbrt(Math.pow(x, 2) + 6 * Math.sin(x));
        else
            f = 1.7 * Math.pow(x, 3) + 7;

        System.out.println("f(x) = " + f);
    }
}
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (-4 < x && x <= 5)
            f = Math.cbrt(Math.pow(x, 2) + 3) + 6 * Math.pow(x, 2);
        else
            f = Math.pow(x, 5) + 3.5;

        System.out.println("f(x) = " + f);
    }
}
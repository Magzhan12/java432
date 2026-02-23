import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (0 < x && x < 2)
            f = Math.pow(x, 3) * Math.cos(x);
        else if (x >= 2)
            f = 3 * Math.pow(x, 4) + 7;
        else
            f = Math.sqrt(5 * Math.pow(x, 2) + 1.6);

        System.out.println("f(x) = " + f);
    }
}
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (-2 < x && x < 5)
            f = 5 * Math.pow(x, 2) + 6;
        else
            f = Math.pow(x, 3) + 7;

        System.out.println("f(x) = " + f);
    }
}
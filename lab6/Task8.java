import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (-5 < x && x < 0)
            f = Math.sqrt(Math.pow(x, 2) + Math.abs(x));
        else
            f = 5 * Math.pow(x, 3) + Math.cos(x);

        System.out.println("f(x) = " + f);
    }
}

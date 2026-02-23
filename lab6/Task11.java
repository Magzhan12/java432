import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (0 < x && x <= 4)
            f = Math.sin(Math.pow(x, 5)) + Math.sqrt(Math.pow(x, 2) + 6);
        else
            f = Math.log(x) + Math.sqrt(3 * x + 7);

        System.out.println("f(x) = " + f);
    }
}

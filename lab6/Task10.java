import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0)
            f = Math.pow(x, 2) * Math.sin(x) + Math.sqrt(Math.pow(x, 2) + 1.2);
        else
            f = Math.pow(Math.tan(x), 2) + Math.cos(x) + 3.5;

        System.out.println("f(x) = " + f);
    }
}
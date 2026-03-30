import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            System.out.print("a = ");
            double a = sc.nextDouble();
            System.out.print("b = ");
            double b = sc.nextDouble();

            double res = a + b;
            String record = a + " + " + b + " = " + res;

            history.add(record);
            System.out.println(record);

            System.out.println("Тарих:");
            for (String h : history)
                System.out.println(h);

            System.out.println("0 - шығу, басқа сан - жалғастыру");
            if (sc.nextInt() == 0) break;
        }
    }
}
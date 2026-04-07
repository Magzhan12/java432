import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = text.replaceAll("[aeiouAEIOUаәеёиоуыі]", "*");
        System.out.println(result);
    }
}
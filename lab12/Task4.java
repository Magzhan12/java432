import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String noSpace = text.replace(" ", "");
        System.out.println(noSpace.length());
    }
}
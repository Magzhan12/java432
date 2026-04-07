import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int vowels = 0, consonants = 0;
        String v = "aeiouAEIOUаәеёиоуыі";

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (v.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }

        System.out.println("Дауысты: " + vowels);
        System.out.println("Дауыссыз: " + consonants);
    }
}
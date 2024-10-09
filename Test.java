import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int score = 0;
        int wordcount = 1;
        String str1;
        String str2;
        System.out.print("Enter first word: ");
        str1 = scan.nextLine();
        while (score < 50) {
            System.out.print("Enter next word: ");
            str2 = scan.nextLine();
            wordcount ++;

            if (str1.compareTo(str2) > 0) {
                score -= 5;
                System.out.println("-5 points: current word is alphabetically before; SCORE: " + score);
            } else if (str1.compareTo(str2) < 0) {
                score += 2;
                System.out.println("+2 points: current word is alphabetically after; SCORE: " + score);
            } else {
                score -= 10;
                System.out.println("-10 points: current word is the exact same word as previous word; SCORE: " + score);
            }

            if (str1.substring(str1.length() - 2).compareTo (str2.substring(0, 2)) == 0) {
                score += 5;
                System.out.println("+5 points: last two letters of the previous word match first two letters in current word; SCORE: " + score);
                }

            if (str2.indexOf(str1.substring(0,1)) > -1) {
                score += 3;
                System.out.println("+3 points: first letter of the previous word found in the current word; SCORE: " + score);
            }

            if (str1.length() == str2.length()) {
                score += 3;
                System.out.println("+3 points: length of previous word same as current word; SCORE: " + score);
            }

            str1 = str2;

        }

        System.out.println("You win! It took you " + wordcount + " words! Try again for a lower word count :)");
    }
}

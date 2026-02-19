import java.util.Scanner;
import java.util.Arrays;

public class MixedStrings {
    public static String reversing(String s) {
        String[] w = s.split(" ");
        StringBuilder result = new StringBuilder();
    
        for (String word : w) {
            char f = word.charAt(0);
            char l = word.charAt(word.length() - 1);
            String mid = word.substring(1, word.length() - 1);
    
            result.append(l);
            result.append(mid);
            result.append(f);
            result.append(" ");
        }
    
        return result.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(reversing(s));
    }
}

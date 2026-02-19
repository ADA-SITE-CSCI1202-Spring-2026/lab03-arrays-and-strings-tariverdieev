import java.util.Scanner;
import java.util.Arrays;

public class SortingStrings {
    public static String sorting(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sorting(s));
    }
}

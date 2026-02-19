import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static String sorting(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static Boolean check(String s1 , String s2){
        //System.out.println(s1 + " " + s2);
        if(s1.equals(s2) == true){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s2 = sorting(s2);
        s1 = sorting(s1);
        if(check(s1 , s2) == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

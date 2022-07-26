import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String v = "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            v = c+v;
        }
        System.out.println(v);
        if(v.equals(s)){
            System.out.println("Palindrome ...  ");
        }
        else{
            System.out.println("Not a Palindrome ...  ");
        }
    }
}

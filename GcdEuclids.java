import java.util.*;
public class GcdEuclids {
    public int gcd(int n1,int n2){
        if(n1 == 0){
            return n2;
        }
        else{
            return gcd(n2%n1,n1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GcdEuclids gc = new GcdEuclids();
        int c = gc.gcd(a,b);
        System.out.println("The gcd between 2 numbers is - " + c);
    }
}

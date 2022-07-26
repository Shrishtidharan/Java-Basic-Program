import java.util.*;
public class Factorialrec {
    static int fact(int mm){
        if(mm == 0 || mm ==1){
            return 1;
        }
        else{
            return (mm * fact(mm-1));
        }
    }
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int ques = xx.nextInt();
        int ans = fact(ques);
        System.out.println("The factorial is - " +ans);
    }
    
}

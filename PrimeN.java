import java.util.*;
public class PrimeN{
    public void isPrime(int vv){
       boolean flag = true;
       for(int z = 2;z<= vv/2;z++){
        if(vv%z == 0){
            flag = false;
            break;
        }
       }
       if(flag){
        System.out.println("Prime number ...");
       } 
       else{
        System.out.println("Composite  number ...");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ques = sc.nextInt();
        PrimeN pp = new PrimeN();
        pp.isPrime(ques);
    }
}
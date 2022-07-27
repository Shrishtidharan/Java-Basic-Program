/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main

{   public static boolean isPrime(int a){
    boolean flag = true;
    for(int z =2;z<=a/2;z++){
        if(a % z ==0){
            flag = false;
            break;
        }
    }
    return flag;
}

	public static void main(String[] args) {
	    int sum =0;
		int arr[] = {2,4,5,7,8};
		for(int c : arr){
		    if(isPrime(c)){
		        sum+=c;
		    }
		}
		System.out.println("Sum of a prime number is - " + sum);
	
	}
}

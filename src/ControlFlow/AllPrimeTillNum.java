package ControlFlow;
import java.util.*;


public class AllPrimeTillNum {
    public static boolean Primenum(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(Primenum(i)){
                System.out.println(i);
            }
        }
    }

}

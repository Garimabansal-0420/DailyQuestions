package ControlFlow;

import java.util.*;

public class SumDigitUntilSingleDigit {
    public static int digit(int n){
        while(n>10){
            int rev=0;
        while(n>0){
            rev+=n%10;
            n=n/10;
        }
        n=rev;
        }

        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result= digit(num);

        System.out.println(result);

    }
}

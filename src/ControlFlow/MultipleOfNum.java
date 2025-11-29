package ControlFlow;
import java.util.*;
public class MultipleOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0 || num >100){
            System.out.println("take another input ");
        }

        for(int i=100 ;i>=1;i--){
            if(i%num==0){
                System.out.println(i);
                continue;
            }
        }
    }
}

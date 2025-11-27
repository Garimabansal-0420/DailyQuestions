package ControlFlow;
import java.util.*;

public class CountNoBackToOne {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        while(no>=1){
            System.out.println(no--);
        }
    }

}

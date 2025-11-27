package ControlFlow;
import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day=sc.nextInt();
        if(month ==3){
            if(day>=20 && day<=31){
                System.out.println("it's spring season");
            }
            else{
                System.out.println("it's not spring season");
            }
        }
        if(month ==4 || month ==5){
            System.out.println("it's spring season");
        }
        if(month ==6 ){
            if(day<=20 && day >0) {
                System.out.println("it's spring season");
            }
            else{
                System.out.println("it's not spring season");
            }
        }
        if(month <3 || month >6){
            System.out.println("it's not spring season");
        }
    }

}

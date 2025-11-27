package ControlFlow;
import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int month=sc.nextInt();
        int day=sc.nextInt();
        boolean isvalid=false;

        if(month ==3){
            if(day>=20 && day<=31){
                isvalid=true;
            }

        }
        else if(month ==4 ){
            if(day >=1 && day <=30) {
                isvalid = true;
            }
        }
        else if(month==5){
            if(day >=1 && day <=31){
                isvalid=true;
            }
        }
        else if(month ==6 ){
            if(day>=1 && day<=20) {
                isvalid=true;
            }
        }
        if(isvalid){
            System.out.println("it's spring season");
        }
        else{
            System.out.println("it's not spring season");
        }
    }

}




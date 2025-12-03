package oops;
import java.util.*;

class circle{
    double radius;

    double calccircum(){
        return Math.PI*2*radius;
    }
    double calcarea(){
        return Math.PI*radius*radius;
    }

    public void details(){
        System.out.println(radius);
        System.out.println(calccircum());
        System.out.println(calcarea());
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle r= new circle();
        r.radius=sc.nextDouble();
        r.details();
    }
}

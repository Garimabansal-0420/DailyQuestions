package JavaArray;
import java.util.*;

public class StoreMultipleValues {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double[] numbers = new double[10];  // array of 10 elements
        double total = 0.0;
        int index = 0;
        while(true){
            double num=sc.nextDouble();
            if(num <=0){
                break;
            }
            if(index ==10){
                break;
            }
            numbers[index]=num;
            index++;
        }
        for(int i =0;i<index ; i++){
            System.out.println(numbers[i]);
            total +=numbers[i];
        }
        System.out.println(total);
    }
}

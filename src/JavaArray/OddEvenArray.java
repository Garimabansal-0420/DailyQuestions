package JavaArray;
import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] odd=new int[(num/2)+1];
        int[] even=new int[(num/2)+1];
        int j=0;
        int k=0;
        for (int i =0 ;i<=num;i++){
            if(i%2==0){
                even[j]+=i;
                j++;
            }
            else{
                odd[k]=i;
                k++;
            }
        }
        for(int i=0;i<(num/2)+1;i++){
            System.out.print(even[i] + " ");
        }
        System.out.println();
        for(int i=0;i<(num/2);i++){
            System.out.print(odd[i] + " ");
        }
    }
}

package oops;
import java.util.*;

class Palindrome{
    String text;
    boolean ispalindrome(){
        String reversed="";
        for(int i=text.length()-1;i>=0;i--){
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void display(){
        if(ispalindrome()){
            System.out.println(text + " is palindrome.");
        }
        else{
            System.out.println(text +" is not a palindrime.");
        }
    }

}
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Palindrome p = new Palindrome();
        p.text = sc.nextLine();
        p.display();
    }
}

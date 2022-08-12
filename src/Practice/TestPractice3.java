package Practice;

import java.awt.*;
import java.util.Scanner;

public class TestPractice3 {
    static int i = 2;
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);


        System.out.println("Enter number:");
        int num= in.nextInt();
        if(isPrime(num)){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int n){
        if(n==0||n==1)
            return false;
        if(n==i)
            return true;
        if(n%i==0){
            return false;
        }
        i++;
        return isPrime(n);
    }
}

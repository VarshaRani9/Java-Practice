package Assignments;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int num = sc.nextInt();
        int numCopy = num;
        int count = 0;
        while(numCopy!=0){
            numCopy/=10;
            count++;
        }
        numCopy=num;

        int revNum =0;
        int p = (int) Math.pow(10, count-1);
        
        while(numCopy!=0){
            revNum+=(numCopy%10)*p;
            p/=10;
            numCopy/=10;
        }
        System.out.println(num+" after reversal : "+revNum);

        sc.close();
    }
}

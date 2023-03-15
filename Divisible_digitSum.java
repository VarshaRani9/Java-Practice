package Assignments;

import java.util.Scanner;

public class Divisible_digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        divisibilityCheck(num);
        sc.close();
    }
    
    public static void divisibilityCheck(int num){
        int numCopy = num;
        int sumOfDigits = 0;
        while(numCopy != 0){
            sumOfDigits+=numCopy%10;
            numCopy/=10;
        }
        if(num%sumOfDigits ==0)
            System.out.println("Yes! the number is divisible by sum of its digit");
        else
        System.out.println("No! the number is not divisible by sum of its digit");

    }
}

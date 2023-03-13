package Assignments;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int numCopy = num;

        int sumOdd = 0;
        int sumEven = 0;

        int count = 0;
        while(numCopy!=0){
            numCopy/=10;
            count++;
        }

        while(num!=0){
            if(count%2==0)
            sumEven+=num%10;
            else 
            sumOdd+=num%10;
            num/=10;
            count--;
        }

        System.out.println("Sum of Digits of Odd Places "+sumOdd);
        System.out.println("Sum of Digits of even Places "+sumEven);
        

        sc.close();
    }
}

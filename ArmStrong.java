package Assignments;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which is to be checked as an ArmStrong Value");
        int num = sc.nextInt();
        System.out.println(num+ " is a Armstrong number ? : " +armstrong(num));
        sc.close();
    }

    public static boolean armstrong(int n){
        int numCopy = n;
        int count = 0;
        while(numCopy!=0){
            numCopy/=10;
            count++;
        }
        numCopy = n;
        int sum = 0;
        while(n!=0){
            sum+=(Math.pow((n%10),count));
            n/=10;
        }
        if(sum==numCopy)return true;
        return false;
    }
}
 
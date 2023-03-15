package Assignments;

import java.util.Scanner;

public class PrimeBwOneAndN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number : ");
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 and "+n+" are :");
        boolean print = false;
        for (int i = 2; i <= n; i++) {
            print = true;
            for (int j = i-1; j > 1 ; j--) {
                if(i%j == 0)print = false;
            }
            if(print == true)
            System.out.println(i);
        }
        sc.close();
    }
}

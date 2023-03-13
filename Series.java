package Assignments;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms for sum of series (1 + 1/2 + 1/3+ ...");
        int terms = sc.nextInt();
        float sum =0;
        for(float i = 1; i<=terms; i++){
            sum+=1/i;
        }
        System.out.println("Sum of series : "+sum);

        sc.close();
    }
}

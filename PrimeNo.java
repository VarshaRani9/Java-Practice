package Assignments;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        // System.out.println("Entered number is Prime ? : "+prime1(num));
        // System.out.println("Entered number is a Prime number ? : "+prime2(num));
        System.out.println("Entered number is a Prime number ? : "+prime3(num));
        sc.close();
    }

    public static boolean prime1(int num){
        if(num==1)return false;
        int factor = 0;
        for (int i = 2; i < num; i++) {
            if(num%i == 0)factor++;
            if(factor != 0)break;
        }
        if(factor!=0)return false;
        return true;
    }

    public static boolean prime2(int num){
        if(num==1)return false;
        int factor = 0;
        for (int i = 2; i*i < num; i++) {
            if(num%i == 0)factor++;
            if(factor != 0)break;
        }
        if(factor!=0)return false;
        return true;
    }

    public static boolean prime3(int num){
        if(num==1)return false;
        if(num==2 || num==3)return true;
        if(num%2==0 || num%3==0)return false;
        int factor = 0;
        for (int i = 5; i*i < num; i++) {
            if(num%i == 0 || num%(i+2)==0)factor++;
            if(factor != 0)break;
        }
        if(factor!=0)return false;
        return true;
    }
}

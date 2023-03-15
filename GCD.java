package Assignments;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for their HCF : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf(num1, num2));
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf1(num1, num2));
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf2(num1, num2));
        sc.close();
    }

    public static int hcf(int x, int y){
        while(x!=y){
            if(x>y)x=x-y;
            if(y>x)y=y-x;
        }
        return x;
    }
    public static int hcf1(int a, int b){
        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    public static int hcf2(int x, int y){
        int min = Math.min(x,y);
        while(min>0){
            if(x%min==0 && y%min==0){
                return min;
            }
            min--;
        }
        return min;
    }
}

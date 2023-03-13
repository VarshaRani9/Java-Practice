package Assignments;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for their LCM : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Lcm of "+num1+" and "+num2+" is "+lcm(num1, num2));
        sc.close();
    }

    public static int lcm(int x, int y){
        int hcf = gcd(x, y);
        return (x*y)/hcf;
    }

    public static int gcd(int x, int y){
        while(x!=y){
            if(x>y)x=x-y;
            if(y>x)y=y-x;
        }
        return x;
    }
}

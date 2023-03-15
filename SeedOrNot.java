package Assignments;

import java.util.Scanner;

public class SeedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the seed value : ");
        int seed = sc.nextInt();
        System.out.println("Entered seed value is a seed of entered number ? "+seeed(seed, num));
        sc.close();
    }
    
    public static boolean seeed(int seed, int num){
        int seedCopy = seed;
        while(seedCopy != 0){
            seed*=seedCopy%10;
            seedCopy/=10;
        }
        if(seed == num)return true;
        return false;
    }
}

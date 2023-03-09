package Assignments;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed :");
        int units = sc.nextInt();

        System.out.println("Electricity bill : Rs."+bill(units));

        sc.close();
    }

    public static float bill(int units){
        float charge = 0;
        if(units <= 199)charge+=units*1.20;
        else if(units>=200 && units<400)charge+=units*1.50;
        else if(units>=400 && units<600)charge+=units*1.80;
        else charge+=units*2.00;

        if(charge>400){
            charge = charge+(charge*15/100);
        }

        return charge;
    }
}

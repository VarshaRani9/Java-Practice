package Assignments;

import java.util.Scanner;

public class ATMMachine {
    static int totalAmount = 17000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number regarding service you want ");
        System.out.println("1 -> Withdraw cash");
        System.out.println("2 -> Deposit cash");
        System.out.println("3 -> Check bank balance");
        System.out.println("4 -> Pay Bills");
        byte opt = sc.nextByte();
        if(opt==1)WithdrawCash();
        else if(opt==2)DepositCash();
        else if(opt==3)CheckBankBalance();
        else if(opt==4)PayBills();
        else System.out.println("invalid option");
        sc.close();
    }

    static void WithdrawCash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        float withdrawAmt = sc.nextFloat();
        System.out.println("Available amount before withdrawl: "+totalAmount);
        totalAmount-=withdrawAmt;
        System.out.println("Available amount after Withdrawl: "+totalAmount);
        sc.close();
    }
    static void DepositCash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to Deposit");
        float depositAmt = sc.nextFloat();
        System.out.println("Available amount before Depositing Cash : "+totalAmount);
        totalAmount-=depositAmt;
        System.out.println("Available amount after Depositing Cash : "+totalAmount);
        sc.close();
    }
    static void CheckBankBalance(){
        System.out.println("Available amount in Bank account is "+totalAmount);
    }
    static void PayBills(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to pay for bills");
        float PayAmt = sc.nextFloat();
        System.out.println("Available amount before paying bills : "+totalAmount);
        totalAmount-=PayAmt;
        System.out.println("Available amount after paying bills : "+totalAmount);
        sc.close();
    }
}

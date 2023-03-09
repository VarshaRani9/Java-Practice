package Assignments;

import java.util.Scanner;

public class Calculator {
    static int input2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for performing mathematical operation and 2 for conversion among number Systems");
        int input1 = sc.nextInt();

        if(input1 == 1){
        System.out.println("Choose the related number from following for the operation you want to perform :");
        System.out.println("1 -> Addition");
        System.out.println("2 -> Substraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        System.out.println("5 -> Modulus");
        System.out.println("6 -> Square");
        System.out.println("7 -> Cube");
        System.out.println("8 -> Abstract");
        System.out.println("9 -> Power");
        input2 = sc.nextInt();
        }
        else if(input1 ==2){
        System.out.println("Choose the related number from following for the coversion you want to perform :");
        System.out.println("1 -> Binary to Decimal");
        System.out.println("2 -> Decimal to Binary");
        System.out.println("3 -> Binary to Octal");
        System.out.println("4 -> Octal to Binary");
        System.out.println("5 -> Binary to HexaDecimal");
        System.out.println("6 -> Hexadecimal to Binary");
        System.out.println("7 -> Decimal to Octal");
        System.out.println("8 -> Octal to Decimal");
        System.out.println("9 -> Decimal to HexaDecimal");
        System.out.println("10 -> HexaDecimal to Decimal");
        System.out.println("11 -> HexaDecimal to Octal");
        System.out.println("12 -> Octal to HexaDecimal");
        input2 = sc.nextInt();
        }
        else {
            System.out.println("Invalid input");
        }



if(input1==1 && input2==1){
    System.out.println("Enter 2 operands for Addition");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
}
else if(input1 == 1 && input2==2){
    System.out.println("Enter 2 operands for Substraction");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Substraction of "+a+" and "+b+" is "+(a-b));
}
else if(input1 == 1 && input2==3){
    System.out.println("Enter 2 operands for Multiplication");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
}
else if(input1 == 1 && input2==4){
    System.out.println("Enter 2 operands for Division");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Division of "+a+" and "+b+" is "+(a/b));
}
else if(input1 == 1 && input2==5){
    System.out.println("Enter 2 operands for Modulus");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Modulus of "+a+" and "+b+" is "+(a%b));
}
else if(input1 == 1 && input2==6){
    System.out.println("Enter a operand to be squared");
    int a = sc.nextInt();
    System.out.println("Square of "+a+" is "+(a*a));
}
else if(input1 == 1 && input2==7){
    System.out.println("Enter a operand to be cubed");
    int a = sc.nextInt();
    System.out.println("Cube of "+a+" is "+(a*a*a));
}
else if(input1 == 1 && input2==8){
    System.out.println("Enter a operand whose abstract value is to be calculated");
    int a = sc.nextInt();
    System.out.println("Abstract value of "+a+" is "+Math.abs(a));
}
else if(input1 == 1 && input2==9){
    System.out.println("Enter 2 operands for Power calculation");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(+a+" to the Power "+b+" is "+Math.pow(a,b));
}
else if(input1==1 && input2>9){
    System.out.println("invalid input");
}
else if(input1 == 2 && input2==1){
    System.out.println("Enter the binary number to be converted in decimal");
    String a = sc.next();
    System.out.println("Decimal equivalent of "+a+" is : "+Integer.parseInt(a,2));
}
else if(input1 == 2 && input2==2){
    System.out.println("Enter the decimal number to be converted in Binary");
    Integer a = sc.nextInt();
    System.out.println("Binary equivalent of "+a+" is : "+Integer.toBinaryString(a));
}
else if(input1 == 2 && input2==3){
    System.out.println("Enter the binary number to be converted in octal");
    String a = sc.next();
    int num = Integer.parseInt(a, 2);
    System.out.println("Octal equivalent of "+a+" is : "+Integer.toOctalString(num));
}
else if(input1 == 2 && input2==4){
    System.out.println("Enter the Octal number to be converted in Binary");
    String a = sc.next();
    Integer num = Integer.parseInt(a, 8);
    System.out.println("Binary equivalent of "+a+" is : "+Integer.toBinaryString(num));
}
else if(input1 == 2 && input2==5){
    System.out.println("Enter the binary number to be converted in HexaDecimal");
    String a = sc.next();
    int num = Integer.parseInt(a, 2);
    System.out.println("HexaDecimal equivalent of "+a+" is : "+Integer.toHexString(num));
}
else if(input1 == 2 && input2==6){
    System.out.println("Enter the HexaDecimal number to be converted in Binary");
    String a = sc.next();
    Integer num = Integer.parseInt(a, 16);
    System.out.println("Binary equivalent of "+a+" is : "+Integer.toBinaryString(num));
}
else if(input1 == 2 && input2==7){
    System.out.println("Enter the Decimal number to be converted in Octal");
    // String a = sc.next();
    Integer num = sc.nextInt();
    System.out.println("Octal equivalent of "+num+" is : "+Integer.toOctalString(num));
}
else if(input1 == 2 && input2==8){
    System.out.println("Enter the Octal number to be converted in Decimal");
    String a = sc.next();
    // Integer num = Integer.parseInt(a, 2);
    System.out.println("Decimal equivalent of "+a+" is : "+Integer.parseInt(a,8));
}
else if(input1 == 2 && input2==9){
    System.out.println("Enter the Decimal number to be converted in HexaDecimal");
    // String a = sc.next();
    Integer num = sc.nextInt();
    System.out.println("HexaDecimal equivalent of "+num+" is : "+Integer.toHexString(num));
}
else if(input1 == 2 && input2==10){
    System.out.println("Enter the HexaDecimal number to be converted in Decimal");
    String a = sc.next();
    // Integer num = Integer.parseInt(a, 16);
    System.out.println("Decimal equivalent of "+a+" is : "+Integer.parseInt(a, 16));
}
else if(input1 == 2 && input2==11){
    System.out.println("Enter the HexaDecimal number to be converted in Octal");
    String a = sc.next();
    Integer num = Integer.parseInt(a, 16);
    System.out.println("Octal equivalent of "+a+" is : "+Integer.toOctalString(num));
}
else if(input1 == 2 && input2==12){
    System.out.println("Enter the Octal number to be converted in HexaDecimal");
    String a = sc.next();
    Integer num = Integer.parseInt(a, 8);
    System.out.println("HexaDecimal equivalent of "+a+" is : "+Integer.toHexString(num));
}
else{
    System.out.println("Invalid input");
}

        sc.close();
    }
    
}

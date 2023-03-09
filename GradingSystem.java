package Assignments;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Mathematics : ");
        float mathMarks = sc.nextFloat();
        System.out.print("Enter the marks of Science : ");
        float scienceMarks = sc.nextFloat();
        System.out.print("Enter the marks of Computer : ");
        float computerMarks = sc.nextFloat();

        float totalMarks = mathMarks+scienceMarks+computerMarks;
        System.out.println("Total Marks : "+totalMarks);

        float percentage = (totalMarks/300)*100;
        System.out.println("Percentage : " +percentage +"%");

        grade(percentage);
        sc.close();
    }
    
    public static void grade(float percentage){
        if(percentage>=90)
            System.out.println("Grade : A");
        else if(percentage>=70 && percentage<90)
            System.out.println("Grade : B");
        else if(percentage>=60 && percentage<70)
            System.out.println("Grade : C");
        else if(percentage>=50 && percentage<60)
            System.out.println("Grade : D");
        else 
            System.out.println("Grade : F");

    }
}

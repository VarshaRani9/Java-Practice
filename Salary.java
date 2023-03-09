import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary :");
        double Basic = sc.nextDouble();
        double HRA = (0.5)*Basic;
        double TA = (0.3)*Basic;
        double MA = (0.25)*Basic;
        double PF = (0.1)*Basic;
        double grossSalary = Basic + HRA + TA + MA;
        double tax = 0.1*grossSalary;
        double netSalary = grossSalary - tax - PF;
        System.out.println("Calculated HRA :"+HRA);
        System.out.println("Calculated TA :"+TA);
        System.out.println("Calculated MA :"+MA);
        System.out.println("Calculated PF :"+PF);
        System.out.println("Calculated Gross Salary :"+grossSalary);
        System.out.println("Calculated Tax :"+tax);
        System.out.println("Calculated Net salary is: "+netSalary);
        sc.close();
    }
}

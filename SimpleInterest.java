import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount -");
        double principle = sc.nextDouble();
        System.out.println("Enter the rate -");
        float rate = sc.nextFloat();
        System.out.println("Enter the time duration -");
        float time = sc.nextFloat();
        double SimpleInterest = (principle*rate*time)/100;
        System.out.println("calculated simple interest is : "+SimpleInterest);
        sc.close();
    }
}

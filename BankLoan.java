import java.util.Scanner;

class Customer{
	private int cus_id;
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	
	private String cus_name;
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	private double EMI;
	private double loanAmt;
	private double roi;
	private double tenure;
	private double totalPayableAmt;

	void callLoanAccount(LoanAccount loan) {
		loan.loanAmount();
		loan.loanInterest();
		loan.loanTenure();
		
		if(loan instanceof HomeLoanAccount) {
			loanAmt = ((HomeLoanAccount)loan).loanAmt;
			roi = ((HomeLoanAccount)loan).tenure;
			tenure = ((HomeLoanAccount)loan).roi;
			 home_EMI(loanAmt, roi, tenure);
			((HomeLoanAccount)loan).loanType();
		}
		else if(loan instanceof EducationLoanAccount) {
			loanAmt = ((EducationLoanAccount)loan).loanAmt;
			roi = ((EducationLoanAccount)loan).tenure;
			tenure = ((EducationLoanAccount)loan).roi;
			education_EMI(loanAmt, roi, tenure);
			((EducationLoanAccount)loan).loanType();
		}
		else if(loan instanceof CarLoanAccount) {
			loanAmt = ((CarLoanAccount)loan).loanAmt;
			roi = ((CarLoanAccount)loan).tenure;
			tenure = ((CarLoanAccount)loan).roi;
			car_EMI(loanAmt, roi, tenure);
			((CarLoanAccount)loan).loanType();
       }
	}
	
	private void home_EMI(double loanAmount, double roi, double tenure) {
		EMI = (loanAmount*roi*Math.pow((1+roi),tenure))/(Math.pow((1+roi),tenure)-1);
		totalPayableAmt = EMI*tenure;
	}
    private void education_EMI(double loanAmount, double roi, double tenure) {
    	EMI = (loanAmount*roi*Math.pow((1+roi),tenure))/(Math.pow((1+roi),tenure)-1);
    	totalPayableAmt = EMI*tenure;
	}
    private void car_EMI(double loanAmount, double roi, double tenure) {
    	EMI = (loanAmount*roi*Math.pow((1+roi),tenure))/(Math.pow((1+roi),tenure)-1);
    	totalPayableAmt = EMI*tenure;
}
    @Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_name=" + cus_name + "\n" +"loanAmt=" + loanAmt
				+ ", roi=" + roi + ", tenure=" + tenure + "\n"+"EMI : "+EMI+ "\n"+"Total Payable Amount = "+totalPayableAmt+"]";
	}
}

class LoanAccount{
	double loanAmt = 100000.00;
	double tenure = 120;
	double roi = 0.006;
	void loanAmount() {
		System.out.println("Amount of Loan is Rs. "+loanAmt);
	}
	void loanTenure() {
		System.out.println("Tenure : "+tenure);
	}
	void loanInterest() {
		System.out.println("Interest on Loan is : "+roi+" %");
	}
}
class HomeLoanAccount extends LoanAccount{
	String loanType = "Home Loan";
	double loanAmt = 1000000.00;
	@Override
    void loanAmount() {
		System.out.println("Amount of Loan is Rs."+loanAmt);
	}
	@Override
	void loanTenure() {
		System.out.println("Tenure : "+tenure);
	}
	void loanType() {
		System.out.println("Loan type :"+loanType);
	}
	
}
class EducationLoanAccount extends LoanAccount{
	String loanType = "Education Loan";
	double loanAmt = 107800.00;
	double tenure = 230;
	double roi = 0.05;
	@Override
    void loanAmount() {
		System.out.println("Amount of Loan is Rs. "+loanAmt);
	}
	@Override
	void loanTenure() {
		System.out.println("Tenure : "+tenure);
	}
	@Override
	void loanInterest() {
		System.out.println("Interest on Loan is : "+roi+" %");
	}
	void loanType() {
		System.out.println("Loan type :"+loanType);
	}
}
class CarLoanAccount extends LoanAccount{
	String loanType = "Car Loan";
	double loanAmt = 200000.00;
	double tenure = 108;
	double roi = 0.15;
	@Override
    void loanAmount() {
		System.out.println("Amount of Loan is Rs."+loanAmt);
	}
	@Override
	void loanTenure() {
		System.out.println("Tenure : "+tenure);
	}
	@Override
	void loanInterest() {
		System.out.println("Interest on Loan is : "+roi+" %");
	}
	void loanType() {
		System.out.println("Loan type :"+loanType);
	}
}

public class BankLoan {

	public static void main(String[] args) {		
		Customer cus = new Customer();
		cus.setCus_id(101);
		cus.setCus_name("Varsha Rani");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter loan Account type : 1.Home 2.Education 3.Car");
		int choice = sc.nextInt();
		if(choice == 1)cus.callLoanAccount(new HomeLoanAccount());
		if(choice == 2)cus.callLoanAccount(new EducationLoanAccount());
		if(choice == 3)cus.callLoanAccount(new CarLoanAccount());
		System.out.println(cus);
		sc.close();
	}

}

import java.util.Scanner;
public class anvil {
    //Main method
    /*annualInterestRate   年利率
      monthlyInterestRate  月利率
      numberOfYears        贷款年度数
      monthlyPayment       月支付额度
      totalPayment         总支付额度
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate,for example, 5.75: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate/1200; //月利率

        System.out.print("Enter number of years as an integer,for example, 5: ");
        int numberOfYears = input.nextInt();    //贷款年度

        System.out.print("Enter loan amount,for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate /(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment = monthlyPayment*numberOfYears*12;

        System.out.println("The monthlyPayment is $"+(int)(monthlyPayment * 100)/100.0);
        System.out.println("The totalPayment is $"+(int)(totalPayment * 100)/100.0);
    }
}
/*
 monthlyPayment= (loanAmount*monthlyInterestRate) / (1-1/ (1+monthlyInterestRate)^(numberOfYears*12)
 totalPayment=monthlyPayment*numberOfYears * 12
*/

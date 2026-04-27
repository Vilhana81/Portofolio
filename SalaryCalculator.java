import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
    double hourWage;
    double hoursWorked;
    double grossPay;
    double taxDeduction = 0.20;
    double netPay;
    double extraHours;

    System.out.println ("Welcome to the Salary Calculator");
    System.out.println("Please enter your hourly wage");
    Scanner input = new Scanner(System.in);
    hourWage = input.nextDouble();
    System.out.println("Please enter number of hours worked");
    hoursWorked = input.nextDouble();
    System.out.println("Please enter the number of overtime hours");
    extraHours = input.nextDouble();
    grossPay = (hourWage*hoursWorked) + ((hourWage*1.5)*extraHours);
    System.out.println("Your gross pay is " + (hourWage*hoursWorked) + " of normal work hours and " + ((hourWage*1.5)*extraHours) + " of Overtime Hours");
    System.out.println("Total Gross Salary " + grossPay);
    System.out.println("Insert you tax deduction. Note: The deault is 20%. Type 0");
    double inputTax = input.nextDouble();
    if (inputTax != 0)
        taxDeduction = inputTax / 100;
    netPay = grossPay * (1-taxDeduction);
    System.out.println("Your net pay will be " + netPay);
    }
}

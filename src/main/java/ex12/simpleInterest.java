/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */


package ex12;

import java.util.Scanner;

public class simpleInterest{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("Enter the principle. ");
        String principleAmount = in.nextLine();
        System.out.print("Enter the rate of interest. ");
        String interestRate = in.nextLine();
        System.out.print("Enter the number of years. ");
        String numberYears = in.nextLine();



        // Numerical Conversion from string to type double to allow for decimals as well as whole numbers
        double principle = Double.parseDouble(principleAmount);
        double interest = Double.parseDouble(interestRate);
        double years = Double.parseDouble(numberYears);


        // Interest and Investment Worth Calculation
        double totalInterest = principle * interest * years / 100;
        double investmentWorth = principle + totalInterest;



        // Output
        System.out.print("After " + years + " years, at " + interest + "%, the investment will be worth $" + investmentWorth);


    }

}

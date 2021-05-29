/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 12 - Computing Simple Interest
 */

package org.example;

// Import required libraries
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Prompt user for the principal investment, the rate of
        // interest, and the number of years; store these values
        // in their respective datatypes
        System.out.println("Enter the principal: ");
        Scanner principalIn = new Scanner(System.in);
        double principal = principalIn.nextDouble();

        System.out.println("Enter the rate of interest: ");
        Scanner rateOfInterestIn = new Scanner(System.in);
        double rateOfInterest = rateOfInterestIn.nextDouble();

        System.out.println("Enter the number of years: ");
        Scanner numYearsIn = new Scanner(System.in);
        int numYears = numYearsIn.nextInt();

        // Convert the rate of interest into it's correct form
        // and calculate the amount of money at the end of the
        // investment period
        double rOfInterest = rateOfInterest / 100;
        double total = principal * (1 + (rOfInterest * numYears));

        // Limit total to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // Print the output
        System.out.println("After " + numYears + " years at " + rateOfInterest
                            + "%, the investment will be worth $" + df.format(total) + ".");

    }
}

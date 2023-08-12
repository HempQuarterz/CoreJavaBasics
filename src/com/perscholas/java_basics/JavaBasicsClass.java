package com.perscholas.java_basics;


public class JavaBasicsClass {
    public static void main(String [] args) {

        // 1. Declare two integer variables
//        int num1;
//        int num2;
//
//        // Assign value to each integer
//        num1 = 5;
//        num2 = 7;
//
       // Add both integers and assign the sum to another variable
//        int sum = num1 + num2;
//
       // Print out result
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // 2. Declare two double variables

//        double num3;
//        double num4;

            // Assign a number to each

//        num3 = 1.5;
//        num4 = 5.1;

            // Add the two variables to another variable

//         double sum2 = num3 + num4;

            // Print out result

//        System.out.println("The sum of " + num3 + " and "+ num4 + " is " + sum2);


        // 3. Declare an integer variable and a double variable

//            int num5;
//            double num6;

            // Assign a number to each

//            num5 = 5;
//            num6 = 5.5;

            // Assign the sum to a variable

//            double sum3 = num5 + num6;

            // Print out result

//            System.out.println("The sum of " + num5 + " and " + num6 + " is " + sum3);

            // 4. Declare two integer variables

//        double num7;
//        int num8;

            // Assign an integer to each variable
            // Part 2. Change larger number to decimal
//        num7 = 25.5;
//        num8 = 5;

            // Assign result to a variable

//       double quotient1 = num7 / num8 ;

            // Print out result

//        System.out.println("The quotient of " + num7 + " and " + num8 + " is " + quotient1);

        // 5. Declare to double variables

//        double num9;
//        double num10;

        // Assign a number to each

//        num9 = 7.5;
//        num10 = 9.3;

        //Assign division result to a variable

//        double divisionResult = num10/num9;

        //Print out result

//        System.out.println(num10 + " divided by " + num9 + " equals " + divisionResult);

        //Cast the result to an integer

//        int integerResult = (int) divisionResult;

        //Print out the cast result

//        System.out.println("The result after casting to an integer is " + integerResult);

        // 6. Declare two integer variables

//        int x;

//        double y;

        // Assign number to variables

//        x = 5;

//        y = 6;

        // Declare a variable to y/x

//        double q = y / x;

        // Print q

//        System.out.print(q);

        // Cast y to a double and assign it to q

        // 7. Declare a named constant

//        final double PI = 3.14;

        // Use it in a calculation

//        double radius = 5.0;

//        double circumference = 2 * PI * radius;

        // Print result

//        System.out.println("The circumference of a circle with the radius " + radius + " is " + circumference);


        // 8. Create variables for 3 products in a cafe

        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.25;
        double espressoPrice = 2.00;

        // complete an order

        double subtotal = 3 * coffeePrice + 4 * cappuccinoPrice + 2 * espressoPrice;

        // Declare a constant for Sales Tax

        final double SALES_TAX = 0.07;

        // Calculate sales total with sales tax

        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.printf("Subtotal: $%.2f%n ", subtotal);
        System.out.printf("Total Sale (including 7%% sales tax) : $%.2f%n", totalSale);












    }
}

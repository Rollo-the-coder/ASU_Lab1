//=================================================
//  Lab3.java
//  Name: Erik Christian Gotta
//  ASU ID: 1222628953
//  Time taken to complete this lab: 90 minutes
//=================================================

import java.util.Scanner;

class Lab3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Variables Declared
        double number1;
        char operation;
        double number2;
        double result;

        //Input Collection
        System.out.print("Please enter a number: ");
        number1 = sc.nextDouble();

        System.out.print("Please choose an operation to be performed '+ - / * %': ");
        operation = sc.next().charAt(0);

        System.out.print("Please enter a number: ");
        number2 = sc.nextDouble();

        //Switch Calculations 
        switch(operation)
        {
            case '+':   result = number1 + number2;
                        System.out.println("The answer is " + result);
                        break;

            case '-':   result = number1 - number2;
                        System.out.println("The answer is " + result);
                        break;
            
            case '/':   if (number2 == 0) {
                        System.out.println("ERROR: Can not divide using 0 please try again");
                        } else {
                        result = number1 / number2;
                        System.out.println("The answer is " + result); 
                        }
                        break;

            case '*':   result = number1 * number2;
                        System.out.println("The answer is " + result);
                        break;

            case '%':   if (number2 == 0) {
                        System.out.println("ERROR: Can not divide using 0 please try again");
                        } else {
                        result = number1 % number2;
                        System.out.println("The answer is " + result);
                        }
                        break;

            default:    System.out.println("Please enter one of these operations '+ - / * %'");
                        break;
        }

        sc.close();
    }

}
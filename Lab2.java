//=================================================
//  Lab2.java
//  Name: Erik Christian Gotta
//  ASU ID: 1222628953
//  Time taken to complete this lab: 25 minutes
//=================================================

import java.util.Scanner;


//Class to use scanner and if statements 
class Lab2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double input1 = 500;
        double input2 = 600;

        //Input collection
        System.out.print("Please enter the first number: ");
        input1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        input2 = sc.nextDouble();

        //If statement to look at which number is larger and then either find the sum or the difference
        if (input1 >= input2) {
            System.out.println("The sum is " + (input1 + input2));
        } else {
            System.out.println("The difference is " + (input2 - input1));
        }


        sc.close();

    }
}
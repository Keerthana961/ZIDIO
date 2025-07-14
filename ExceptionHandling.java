package com.pack1;

import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0) 
            {
                throw new IllegalArgumentException("Age cannot be negative.");
            }

            System.out.println("Your age is: " + age);
        }
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally
        {
            scanner.close();
            System.out.println("Program terminated.");
        }
    }
}

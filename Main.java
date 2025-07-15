package com.pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User 
{
    String username;
    String password;
    Account account;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.account = new Account();
    }
}

class Account
{
    double balance;

    public Account()
    {
        this.balance = 0.0;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() 
    {
        return balance;
    }
}

class Bank
{
    Map<String, User> users;
    User currentUser;

    public Bank()
    {
        this.users = new HashMap<>();
        this.currentUser = null;
    }

    public void registerUser(String username, String password) 
    {
        users.put(username, new User(username, password));
        System.out.println("User registered successfully!");
    }

    public void loginUser(String username, String password) 
    {
        User user = users.get(username);
        if (user != null && user.password.equals(password)) 
        {
            currentUser = user;
            System.out.println("Login successful!");
        }
        else
        {
            System.out.println("Invalid username or password!");
        }
    }

    public void logout() 
    {
        currentUser = null;
        System.out.println("Logged out successfully!");
    }

    public void deposit(double amount) 
    {
        if (currentUser != null)
        {
            currentUser.account.deposit(amount);
            System.out.println("Current balance: " + currentUser.account.getBalance());
        }
       
        else 
        {
            System.out.println("Please login first!");
        }
    }
    public void withdraw(double amount)
    {
        if (currentUser != null) 
        {
            currentUser.account.withdraw(amount);
            System.out.println("Current balance: " + currentUser.account.getBalance());
        }
        else
        {
            System.out.println("Please login first!");
        }
    }

    public void checkBalance() 
    {
        if (currentUser != null)
        {
            System.out.println("Current balance: " + currentUser.account.getBalance());
        } 
        else
        {
            System.out.println("Please login first!");
        }
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
        
            if (bank.currentUser == null)
            {
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        bank.registerUser(username, password);
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        password = scanner.nextLine();
                        bank.loginUser(username, password);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } 
            else 
            {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println("4. Logout");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline left-over
                        bank.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        amount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline left-over
                        bank.withdraw(amount);
                        break;
                    case 3:
                        bank.checkBalance();
                        break;
                    case 4:
                        bank.logout();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
}

package com.viswa.Process;

import java.util.Scanner;

import com.viswa.Bank.BankInfo;

public class Process {

    Scanner s = new Scanner(System.in);
    static BankInfo bank1 = new BankInfo();

    static{
        bank1.setAccNo("2424101010121");
        bank1.setName("ViswaTeja");
        bank1.setAcc_type("Savings");
        bank1.setBalance(10000);
    }

    public void openAccount(){
        System.out.println("Enter the Account Number:");
        bank1.setAccNo(s.next());
        System.out.println("Enter the Name:");
        bank1.setName(s.next());
        System.out.println("Enter the Account Type:");
        bank1.setAcc_type(s.next());
        System.out.println("Enter the Account Balance:");
        bank1.setBalance(s.nextLong());

        System.out.println("------------ YOUR ACCOUNT DETAILS IS -----------------");
        System.out.println("Name of Account Holder :: " + bank1.getName());
        System.out.println("Account Number :: " + bank1.getAccNo());
        System.out.println("Account Type :: " + bank1.getAccNo());
        System.out.println("Account Balance :: " + bank1.getBalance());
    }
    public void demoAccount(){

        int demobalance = 50000;
        System.out.println("Name of the Account Holder ::" + "Demo user");
        System.out.println("Account Number ::" + "2424101003617");
        System.out.println("Account Type ::" + "Salary");
        System.out.println("Account Balance ::" + demobalance);
    }
    public void deposite(){
        System.out.println("Enter the deposite amount:");
        int deposit = s.nextInt();
        int amount = (int) (bank1.getBalance()+deposit);
        bank1.setBalance(amount);
        System.out.println(" "+deposit+"is deposited in your account");
        System.out.println("Current Available Balance in your account is Rs = " +bank1.getBalance());
    }

    public void withDraw(){
        System.out.println("Enter Amount You want to withdraw:");
        int withdraw = s.nextInt();
        if (withdraw< bank1.getBalance()) {
            bank1.setBalance(bank1.getBalance()-withdraw);
            System.out.println(" "+withdraw+"is withdrawn from your account");
            System.out.println("Current Available Balance in your account is Rs = " +bank1.getBalance());
            
        } else {
             System.out.println("Low Balance");
            System.out.println("Current Available Balance in your account is Rs = " +bank1.getBalance());
        }
    }

    public void checkBalance(){
        System.out.println("Your name is ::" +bank1.getName());
        System.out.println("Account Number is ::" +bank1.getAccNo());
        System.out.println("Account Type is::" +bank1.getAcc_type());
        System.out.println("Account Balance is ::" +bank1.getBalance());
    }

    
}

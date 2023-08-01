package com.viswa.Operation;

import java.util.Scanner;

import com.viswa.Bank.BankInfo;
import com.viswa.Process.Process;

public class Operation {

    public static void bankInformation(){

        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("***Banking System Application***");
        System.out.println("1.) Create New Account\n 2.) Check Account Balance\n 3.) Deposite Amount in Account\n 4.) Withdraw amount from Account\n 5.) Watch Demo Account\n 6.) Exit \n\n Enter Your Choise ::");
        int key = sc.nextInt();
        operation(key);

    }
    public static void operation(int key){
        BankInfo bank = new BankInfo();
        Scanner scan = new Scanner(System.in);
        Process p = new Process();

        switch(key){
            case 1: 
                    System.out.println("----------------------------------------------------------------------------------------------");
                    p.openAccount();
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Main Page_:: Press 1::");
                    if(scan.nextInt() == 1){
                        bankInformation();
                    }
                    break;
            
            case 2: 
                    System.out.println("----------------------------------------------------------------------------------------------");
                    p.checkBalance();
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Main Page_:: Press 1::");
                    if(scan.nextInt() == 1){
                        bankInformation();
                    }
                    break;
            case 3: 
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("--------------Welcome to Deposit Page----------------");
                    p.deposite();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Main Page_:: Press 1::");
                    if(scan.nextInt() == 1){
                        bankInformation();
                    }
                    break;
            case 4: 
                    System.out.println("----------------------------------------------------------------------------------------------");
                    p.withDraw();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Main Page_:: Press 1::");
                    if(scan.nextInt() == 1){
                        bankInformation();
                    }
                    break;
            case 5: 
                    System.out.println("----------------------------------------------------------------------------------------------");
                    p.demoAccount();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Main Page_:: Press 1::");
                    if(scan.nextInt() == 1){
                        bankInformation();
                    }
                    break;

            case 6:
                    System.out.println("Thnaks for using our Bank Application");
                    break;

        }
       
    }

    
}

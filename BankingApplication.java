/**
 * BankingApplication
 */
import java.util.*;
public class BankingApplication {

    public static void main(String[] args) {
        BankAccount yesh=new BankAccount("yesh","1221");

        yesh.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String costumerName;
    String costumerId;
    BankAccount(String cname,String cid){
        costumerName=cname;
        costumerId=cid;
    }
    void deposit(int amount){
        if(amount!=0){
        balance=balance+amount;
        previousTransaction=-amount;
        System.out.println();
        System.out.println(amount+ " deposited sucessfully");
        }
    }
    void withdraw(int amount){
        if(amount!=0&&balance>=amount){
        balance=balance-amount;
        previousTransaction=-amount;
        System.out.println();
        System.out.println(amount+ " withdrawn sucessfully");
        }
        else System.out.println("low balance");
    }

    void getPreviousTransaction(){
     if(previousTransaction>0){
        System.out.println("Deposited "+previousTransaction);
     }
     else if(previousTransaction<0)
     System.out.println("Withdrawn "+Math.abs(previousTransaction));
     else System.out.println("no transaction occured");
    }

    void showMenu(){
        char option ='\0';

        Scanner sc=new Scanner(System.in);

        System.out.println("welcome "+costumerName);
        System.out.println();
        System.out.println("A--> Check Balance");
        System.out.println("B--> Deposit");
        System.out.println("C--> Withdraw");
        System.out.println("D--> Previous Transaction");
        System.out.println("E--> Exit");

        do{
            System.out.println();
            System.out.println("enter any option");
            option=sc.next().charAt(0);

            switch(option){
                case 'A':
                System.out.println();
                System.out.println("Account balance is "+balance);
                break;
                case 'B':
                System.out.println();
                System.out.println("enter Amount");
                int amount1=sc.nextInt();
                deposit(amount1);
                break;
                case 'C':
                System.out.println();
                System.out.println("enter amount");
                int amount2=sc.nextInt();
                withdraw(amount2);
                break;
                case 'D':
                System.out.println();
                getPreviousTransaction();
                break;

                default:
                break;

            }

        }
        while(option!='E');

        System.out.println("Thank You");


    }
   

}
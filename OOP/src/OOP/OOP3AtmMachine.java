package OOP;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 9876;


    ATM(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if(enteredPin == PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin !");
            menu();
        }
    }
//    public void checkPin(){
//        System.out.println("Enter your pin: ");
//        Scanner sc = new Scanner(System.in);
//        int enteredPin = sc.nextInt();
//
//        if(enteredPin == PIN){
//            menu();
//        }
//        else{
//            System.out.println("Enter a valid pin !");
//            menu();
//        }
    //}

    public void menu(){

        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if(option == 1){
            checkBalance();
        } else if (option ==2) {
            withDrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;

        }
        else {
            System.out.println("Enter a valid choice!");

        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withDrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdrawl Successful");

        }

        menu();

    }

    public void depositMoney(){

        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance +=amount;

        System.out.println("Money Deposited Successfully");
            menu();
    }




}

public class OOP3AtmMachine {

    public static void main(String[] args) {

        ATM obj = new ATM();
//        obj.checkPin();

    }
}

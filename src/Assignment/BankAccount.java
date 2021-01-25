package Assignment;

import javax.swing.*;

public class BankAccount {
    int accountNumber = 0;
    String name;
    double balance = 0;

    public BankAccount (double initialBalance, int  accNumber){
        balance = initialBalance;
        accountNumber = accNumber;


    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000, 10000001);
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of your option:\n" +
                "1.To open account\n" + "2. To withdraw money\n" + "3.To deposit money\n" + "4.To display the information" ));

        switch (choice){
            case 1 :
                account.openAccount();
                break;
            case 2:
                double a  = account.withDrawFunds(400);
                break;
            case 3:
                double b = account.depositFunds(5);
                break;
            case 4:
                account.displayAccountInfo( );
                break;

        }
    }
        public void openAccount() {
            name = JOptionPane.showInputDialog("Please Enter your Name ");
            balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance or enter 0"));
            accountNumber++;
        }

        public double withDrawFunds (double fee) {
            balance = balance-fee;
            System.out.println("Now your balance is " +balance);
            return balance;
        }

        public double depositFunds (int rate) {
            balance = balance + rate/100 * balance;
            System.out.println("Now your balance is " +balance);
            return balance;
        }

        public void displayAccountInfo () {
            System.out.println("Name\n" +name);
            System.out.println("The account number is\n" +accountNumber);
            System.out.println("The current balance is\n" +balance);
        }
}
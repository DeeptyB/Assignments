package Assignment;

import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Menu {

    public static int traysRequired;

    public static void main(String[] args) {
        int people = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Number of People"));
        if (people < 10) {
            System.out.println("The Number of People is invalid");
        } else {
            Menu menu = new Menu();
            menu.displayMainMenu();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    menu.displayItalianFoodMenu();
                    int foodItem = input.nextInt();
                    switch (foodItem) {
                        case 1:
                            traysRequired = menu.determineTrays(people, 5);
                            double price = 17.99;
                            double total = menu.getSubtotal(price, traysRequired);
                            double totalWIthTax = menu.getTax(total, 0.07);
                            double totalTip = menu.getTip(total, 0.15);
                            double finalAmount = menu.getGrandTotal(total, totalWIthTax, totalTip);
                            double costPerPerson = menu.pricePerPerson(finalAmount, people);
                            double feeds = menu.determineLeftOvers(5, traysRequired, people);
                            break;
                        case 2:
                            int traysRequired2 = menu.determineTrays(people, 7);
                            double price2 = 15.99;
                            double total2 = menu.getSubtotal(price2, traysRequired2);
                            double totalWIthTax2 = menu.getTax(total2, 0.07);
                            double totalTip2 = menu.getTip(total2, 0.15);
                            double finalAmount2 = menu.getGrandTotal(total2, totalWIthTax2, totalTip2);
                            double costPerPerson2 = menu.pricePerPerson(finalAmount2, people);
                            double feeds2 = menu.determineLeftOvers(7, traysRequired2, people);
                            break;
                        case 3:
                            int traysRequired3 = menu.determineTrays(people, 4);
                            double price3 = 12.99;
                            double total3 = menu.getSubtotal(price3, traysRequired3);
                            double totalWIthTax3 = menu.getTax(total3, 0.07);
                            double totalTip3 = menu.getTip(total3, 0.15);
                            double finalAmount3 = menu.getGrandTotal(total3, totalWIthTax3, totalTip3);
                            double costPerPerson3 = menu.pricePerPerson(finalAmount3, people);
                            double feeds3 = menu.determineLeftOvers(4, traysRequired3, people);
                            break;
                    }

                case 2:
                    menu.displayChineseFoodMenu();
                    int foodItem2 = input.nextInt();
                    switch (foodItem2) {
                        case 1:
                            traysRequired = menu.determineTrays(people, 7);
                            double price = 18.99;
                            double total = menu.getSubtotal(price, traysRequired);
                            double totalWIthTax = menu.getTax(total, 0.07);
                            double totalTip = menu.getTip(total, 0.15);
                            double finalAmount = menu.getGrandTotal(total, totalWIthTax, totalTip);
                            double costPerPerson = menu.pricePerPerson(finalAmount, people);
                            double feeds = menu.determineLeftOvers(7, traysRequired, people);
                            break;
                        case 2:
                            int traysRequired2 = menu.determineTrays(people, 7);
                            double price2 = 18.99;
                            double total2 = menu.getSubtotal(price2, traysRequired2);
                            double totalWIthTax2 = menu.getTax(total2, 0.07);
                            double totalTip2 = menu.getTip(total2, 0.15);
                            double finalAmount2 = menu.getGrandTotal(total2, totalWIthTax2, totalTip2);
                            double costPerPerson2 = menu.pricePerPerson(finalAmount2, people);
                            double feeds2 = menu.determineLeftOvers(7, traysRequired2, people);
                            break;
                        case 3:
                            int traysRequired3 = menu.determineTrays(people, 5);
                            double price3 = 10.99;
                            double total3 = menu.getSubtotal(price3, traysRequired3);
                            double totalWIthTax3 = menu.getTax(total3, 0.07);
                            double totalTip3 = menu.getTip(total3, 0.15);
                            double finalAmount3 = menu.getGrandTotal(total3, totalWIthTax3, totalTip3);
                            double costPerPerson3 = menu.pricePerPerson(finalAmount3, people);
                            double feeds3 = menu.determineLeftOvers(5, traysRequired3, people);
                            break;
                    }
                case 3:
                    menu.displayAmericanFoodMenu();
                    int foodItem3 = input.nextInt();
                    switch (foodItem3) {
                        case 1:
                            traysRequired = menu.determineTrays(people, 8);
                            double price = 21.99;
                            double total = menu.getSubtotal(price, traysRequired);
                            double totalWIthTax = menu.getTax(total, 0.07);
                            double totalTip = menu.getTip(total, 0.15);
                            double finalAmount = menu.getGrandTotal(total, totalWIthTax, totalTip);
                            double costPerPerson = menu.pricePerPerson(finalAmount, people);
                            double feeds = menu.determineLeftOvers(8, traysRequired, people);
                            break;
                        case 2:
                            int traysRequired2 = menu.determineTrays(people, 5);
                            double price2 = 22.99;
                            double total2 = menu.getSubtotal(price2, traysRequired2);
                            double totalWIthTax2 = menu.getTax(total2, 0.07);
                            double totalTip2 = menu.getTip(total2, 0.15);
                            double finalAmount2 = menu.getGrandTotal(total2, totalWIthTax2, totalTip2);
                            double costPerPerson2 = menu.pricePerPerson(finalAmount2, people);
                            double feeds2 = menu.determineLeftOvers(5, traysRequired2, people);
                            break;
                        case 3:
                            int traysRequired3 = menu.determineTrays(people, 10);
                            double price3 = 26.99;
                            double total3 = menu.getSubtotal(price3, traysRequired3);
                            double totalWIthTax3 = menu.getTax(total3, 0.07);
                            double totalTip3 = menu.getTip(total3, 0.15);
                            double finalAmount3 = menu.getGrandTotal(total3, totalWIthTax3, totalTip3);
                            double costPerPerson3 = menu.pricePerPerson(finalAmount3, people);
                            double feeds3 = menu.determineLeftOvers(10, traysRequired3, people);
                            break;

                        default:
                            System.out.println("Please Enter valid choice");
                    }
                default:
                    System.out.println("Please Enter Valid Choice");
            }
        }
    }

    public static void displayMainMenu(){
        System.out.println("\n-------Main Menu--------"+
                " \n Please choose your Option\n" + "1. Italian Food Menu \n2. Chinese Food Menu \n" +
                "3. American Food Menu");
    }
    public static void displayItalianFoodMenu(){
        System.out.println("\n---------- Italian Food Menu---------\n" +
                "1. Lasagna Tray - Feeds 5 - 17.99 \n2. Pizza Pack - Feeds 7 - 15.99 " +
                "\n3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99 \nEnter Choice");
    }
    public static void displayChineseFoodMenu(){
        System.out.println("\n----------- Chinese Food Menu-----------\n" +
                "1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99\n" +
                "2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99" +
                "\n3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99 \n" +
                "Enter Choice");
    }
    public static void displayAmericanFoodMenu(){
        System.out.println("\n--------- American Food Menu---------\n" +
                "1.Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99 " +
                "\n2.Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -22.99" +
                "\nBarbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99" +
                "\nEnter Choice");
    }
    public static int determineTrays(int people, int feeds){
        int traysRequired = 0;
        if(people%feeds==0){
            traysRequired = (people/feeds) ;
        }
        else {
            traysRequired = (people/feeds)+1;
        }
        System.out.println("you need " + traysRequired + " trays");
        return traysRequired;
    }
        public static double getSubtotal(double price, int trays){
            double total = price*trays;
            System.out.println("the price for " + trays + " is: " + total);
            return total;
        }
        public static double getTax(double subtotal, double taxrate){
            double totalWIthTax = taxrate * subtotal;
            System.out.println("The total tax calculated is: " + totalWIthTax);
            return totalWIthTax;
    }
        public static double getTip(double subtotal, double tipRate){
            double totalTip = tipRate*subtotal;
            System.out.println("The total tip amount is:  " + totalTip);
            return totalTip;

    }
        public static double getGrandTotal(double subtotal, double tax, double tip){
            double finalAmount = subtotal + tax + tip;
            System.out.println("Final amount is: " + finalAmount);
            return finalAmount;
    }
        public static double pricePerPerson(double grandTotal, int people){
            double costPerPerson = grandTotal/people;
            System.out.println("The cost per person is: " + costPerPerson);
            return costPerPerson;
    }
        public static int determineLeftOvers(int feeds, int trays, int people){
            int leftover = (feeds*trays)-people;
            System.out.println("Leftover serving for delivery person is: " + leftover);
            return feeds;

    }

}
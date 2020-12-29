package Assignment;

import javax.swing.*;
import java.util.Scanner;

public class QuestionSolutions {

    public static void main(String[] args) {
        //question11a();
        //question11b();
        //question12();
        //question13();
        //question14();
        //question15();
        //question17();
        //question18();
        question19();

    }

    public static void question11a(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = input.nextInt();

        System.out.println("Enter the second number:");
        int y = input.nextInt();

        System.out.println("Numbers before swapping x = " +x+ " and  y = " +y);

        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("Numbers after swapping x = " +x+ " and y = " +y);


    }

    public static void question11b(){

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the First Number");
        int x = input.nextInt();
        System.out.println("Enter the Second Number:");
        int y = input.nextInt();
        System.out.println("Numbers before swapping: x = " +x+ " y = " +y);

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Numbers after swapping: x = " +x+ " y = " +y);
    }

    public static void question12(){

        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the roll number"));
        String name = JOptionPane.showInputDialog("Enter the Name of the Student");
        String nationality = JOptionPane.showInputDialog("Enter the nationality of the student");

        System.out.println("Roll No : " +r+ "\nName : " +name+ "\nNationality : " +nationality);


    }

    public static void question13(){

        int i = Integer.parseInt(JOptionPane.showInputDialog("Enter any Number"));
            if (i<0){
                System.out.println("You have entered a negative number: " +i);
            }
        System.out.println("Exit");
    }

    public static void question14(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number:"));

            if(a>b){
                JOptionPane.showMessageDialog(null, "a is greater than b");
            }

            else if (b>a){
                JOptionPane.showMessageDialog(null, "b is greater than a");
            }

            else {
                JOptionPane.showMessageDialog(null, "a is equal to b");
            }

    }

    public static void question15(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ASCII Number:");
        int i = input.nextInt();

        if (i >= 0 && i <= 128){
            System.out.println(" The ASCII code to character is: " +(char)i);
        }else{
            System.out.println("Please enter number between 0 to 128");
        }
    }

    public static void question16(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int i = input.nextInt();

        if(i % 2 ==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }

    public static void question17(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any year to check");
        int i = input.nextInt();

        if(i % 400 == 0){
            System.out.println("It is a leap year");
        }
        else if(i % 100 ==0){
            System.out.println("It is not a leap year");
        }
        else if (i % 4 == 0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not leap Year");
        }
    }

    public static void question18(){

        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter third number:"));
        if (a > b && a > c){
            JOptionPane.showMessageDialog(null,"The greatest number is " +a);
        }
        else if (b > a && b > c){
            JOptionPane.showMessageDialog(null,"The greatest number is " +b);
        }
        else{
            JOptionPane.showMessageDialog(null,"The greatest number is " +c);
        }
    }

    public static void question19(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first side of triangle:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second side of triangle:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the third side of triangle:"));

        if(a == b && b==c){
            JOptionPane.showMessageDialog(null, "It is an equilateral Triangle");
        }

        else if(a==b || b==c ||c==a){
            JOptionPane.showMessageDialog(null, "It is an isosceles Triangle");
        }
        else{
            JOptionPane.showMessageDialog(null, "It is a Scalene Triangle");
        }
    }
}

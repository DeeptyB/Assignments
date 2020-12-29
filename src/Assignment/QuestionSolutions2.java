package Assignment;

import javax.swing.*;
import java.util.Scanner;

public class QuestionSolutions2 {

    public static void main(String[] args) {
        //question20();
        //question21();
        //question22();
        //question23();
        //question24();
        //question25();
        //question26();
        question27();
        //question28();
        //question29();

    }

    public static void question20(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first 2 digit number:");
        int i = input.nextInt();
        System.out.println("Enter second 2 digit number:");
        int j = input.nextInt();
        System.out.println("Enter your operator to perform");
        char choice = input.next().charAt(0);

        switch (choice){
            case '+':
                int sum = i+j;
                System.out.println("The sum of number you entered is" +sum);
                break;

            case '-':
                int sub;
                if(i>j){
                    sub = i-j;
                    System.out.println("The difference between numbers is " +sub);
                    break;
                }
                else{
                    sub = j-i;
                    System.out.println("The difference between numbers is " +sub);
                    break;
                }
            case '/':
                double div = i/j;
                System.out.println("The answer of division is" +div);
                break;

            case '*':
                int mul = i*j;
                System.out.println("The answer of the multiplication is " +mul);
                break;
        }
    }

    public static void question21(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7");
        int choice = input.nextInt();

        switch (choice){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
        }
    }

    public static void question22(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int n = input.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println("" +n+ "*" +i+ "=" +n*i);
        }
    }

    public static void question23(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to find the sum");
        int n = input.nextInt();
        int sum=0;

        for(int i=1; i<=n; i++){
            sum = sum+i;
        }

        System.out.println("The sum of the number to nth position is: " +sum);
    }
    public static void question24(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to find factorial:");
        int n = input.nextInt();
        int fact = 0;

        for(int i = n ; i>=1 ; i--){

            fact = fact*i;
        }

        System.out.println("The factorial of the number is " +fact);
    }

    public static void question25(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students");
        int n = input.nextInt();
        int highest = 0;

        for(int i = 1; i<=n ; i++){
            System.out.println("Enter the name of the Student:");
            String name = input.next();
            System.out.println("Enter the score of the Student:");
            int score = input.nextInt();

            if (highest<score){
                highest = score;
            }
        }

        System.out.println("The highest Score is " +highest);
    }

    public static void question26(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to reverse");
        int n = input.nextInt();
        int reversenum = 0;

        while (n!=0){
            reversenum = reversenum * 10;
            reversenum = reversenum + n%10;
            n = n/10;
        }

        System.out.println("Thr reverse of the number is " +reversenum);
    }

    public static void question27(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        int product = 1;
        int sum = 0;

        while( n >0){
            int i = n %10;
            sum = sum + i;
            product = product * i;
            n = n/10;
        }
        System.out.println("The sum of digits is " +sum);
        System.out.println("The product of the digits is " +product);
    }

}

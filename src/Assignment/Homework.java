package Assignment;

import javax.swing.JOptionPane;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        greetings();
        introduction();
        sum();
        simpleInterest();
        area();
        perimeter();
        cylinderVolume();
        temperatureCon();
        weightCon();

    }

    public static void greetings(){
        System.out.println("Hello, How are you?\n " +
                "Welcome to the Java Class\n" +
                "Nice to meet you.\n");
    }

    public static void introduction(){
        System.out.println("Hello Everyone, I am Deepti Baral.\n I recently graduated in Computer " +
                "Information System this December 2020. \n I am looking forward to this class for " +
                "deep learning and understanding of Java.\n\n");
    }

    public static void sum(){
        int firstNumber, secondNumber, s;
        Scanner number = new Scanner(System.in);

        System.out.println("***Sum of Numbers***");
        System.out.println("\nEnter the First Number:");
        firstNumber = number.nextInt();
        System.out.println("Enter Second Number:");
        secondNumber = number.nextInt();

        s = firstNumber + secondNumber;

        System.out.println("The Sum of these numbers: " +s);
           }

    public static void simpleInterest(){
        float p,t,r,sInterest;
        Scanner num = new Scanner(System.in);

        System.out.println("\nEnter the Principle Amount:");
        p = num.nextFloat();
        System.out.println("Enter the Time:");
        t = num.nextFloat();
        System.out.println("Enter the Rate:");
        r = num.nextFloat();


        sInterest= (p*t*r)/100;
        System.out.println("The Simple Interest is:" +sInterest);

    }

    public static void area(){
        double r,l,w, b,h,areaCircle, areaRectangle, areaTriangle;
        Scanner num = new Scanner(System.in);

        System.out.println("\n***For Circle****");
        System.out.println("Enter the Radius of Circle:");
        r = num.nextDouble();
        areaCircle = Math.PI*r*r;
        System.out.println("The area of Circle is: " +areaCircle);

        System.out.println("\n***For Rectangle****");
        System.out.println("Enter the length:");
        l = num.nextDouble();
        System.out.println("Enter the Width:");
        w = num.nextDouble();
        areaRectangle = l * w;
        System.out.println("The area of the Rectangle is: " +areaRectangle);

        System.out.println("\n***For Triangle****");
        System.out.println("Enter the Base:");
        b = num.nextDouble();
        System.out.println("Enter the Height:");
        h = num.nextDouble();


        areaTriangle = 0.5*b*h;
        System.out.println("The area of Triangle is:" +areaTriangle );
    }

    public static void perimeter(){
        double r, l, w, a,b,c,  periCircle, periRectangle, periTriangle;
        Scanner num = new Scanner(System.in);

        System.out.println("***For Circle***");
        System.out.println("Enter the Radius:");
        r = num.nextDouble();
        periCircle = 2 * Math.PI * r;
        System.out.println("The perimeter of Circle is:" +periCircle);

        System.out.println("\n*** For Rectangle***");

        System.out.println("Enter the Length:");
        l = num.nextDouble();
        System.out.println("Enter the width:");
        w = num.nextDouble();

        periRectangle = 2 * (l + w);
        System.out.println("The perimeter of Rectangle is:"  +periRectangle);

        System.out.println("\n***For Triangle***");

        System.out.println("Enter the First side:");
        a = num.nextDouble();
        System.out.println("Enter the second side:");
        b = num.nextDouble();
        System.out.println("Enter the third side:");
        c = num.nextDouble();

        periTriangle = a + b + c;
        System.out.println("The perimeter of the Triangle is:" +periTriangle);
    }

    public static void cylinderVolume(){
        double r, l, volCylinder;
        Scanner num = new Scanner(System.in);
        System.out.println("\nEnter the Radius:");
        r = num.nextDouble();

        System.out.println("Enter the Length:");
        l = num.nextDouble();

        volCylinder = Math.PI * r * r * l;
        System.out.println("The volume of the Cylinder is: " +volCylinder);
    }

    public static void temperatureCon(){
        double f1,c1, f2,c2;
        Scanner num = new Scanner(System.in);

        System.out.println("\nEnter the temperature in Fahrenheit");
        f1 = num.nextDouble();
        c1 =  ( f1 - 32) * 5/9 ;
        System.out.println("The equivalent Temperature in Celsius is : " +c1);

        System.out.println("Enter the Celsius Temperature to convert");
        c2 = num.nextDouble();
        f2 = 0.2 * (9*c1 + 160);
        System.out.println("The Equivalent Fahrenheit Temperature is: " +f2);
    }

    public static void weightCon(){
        double p, k ;
        Scanner num = new Scanner(System.in);

        System.out.println("\nEnter Pound to Convert into KG");
        p = num.nextDouble();

        k = p * 0.454;
        System.out.println("The Equivalent KG is " +k);
    }
}

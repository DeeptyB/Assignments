package Assignment;

import javax.swing.*;

public class Solution10 {
    public static void main(String[] args) {

        //Questions10a();
        Questions10c();

    }
    public  static void Questions10a(){

        double u  = Double.parseDouble(JOptionPane.showInputDialog("Enter u "));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Enter t"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a"));

        double s = u * t + 0.5 * a * t * t;
        JOptionPane.showMessageDialog(null, "The S calculated is: " +s);

    }

    public static void Questions10c(){

        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c"));

        double x = 0.5 * (-b + Math.sqrt((b * b) - (4 * a * c)));
        JOptionPane.showMessageDialog(null, "The value of x is : " +x);


    }
}

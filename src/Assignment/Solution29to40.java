package Assignment;

import javax.swing.*;
import java.util.Scanner;

public class Solution29to40 {

    public static void main(String[] args) {
        Solution29to40 obj = new Solution29to40();
        //obj.solution29();
        //obj.solution30();
        //obj.solution31();
        //obj.solution32();
        //obj.solution33();
        //obj.solution34();
        //obj.solution37();
        //obj.solution38();
        //obj.solution39();//Need to work on
        obj.solution40();


    }
        public void solution29 () {
            int i;
            double fact = 1.0;
            double a = 0;
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));

            for (i = 1; i <= n; i++) {

                for (int j = 1; j <= i; j++) {
                    fact = fact * j;
                }
                a = a + (i / fact);

            }
            System.out.println("The solution is " + a);
        }

        public void solution30 () {

            int count = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
            int n1 = 0, n2 = 1, n3, i;
            System.out.print(" " + n2);
            for (i = 2; i <= count; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }

        public void solution31 () {
            int i, j;
            int row = 5;
            for (i = 1; i <= row; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + "");
                }
                System.out.println();
            }

        }

        public void solution32 () {
            int[] array = new int[5];
            int sum = 0;
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter the elements:");
                array[i] = input.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("The sum of the elements is " + sum);
        }

        public void solution33 () {
            int temp;
            int[] array = new int[5];

            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the elements for the array"));
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");

            }

        }

        public void solution34 () {

            int[] a = new int[5];
            int temp, start = 0;
            int end = a.length - 1;

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the elements:"));
            }

            for (int i = 0; i < a.length; i++) {
                while (start < end) {
                    temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    start++;
                    end--;
                }
            }

            for (int i = 0; i < a.length; i++) {

                System.out.print(a[i] + " ");
            }
        }

            public void solution37(){
            int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
            int [][] b = {{4,5,6},{2,7,8},{3,1,9}};
            int [][] s = new int[3][3];
            final int ROW = 3;
            final int COL = 3;

                for (int i = 0; i < ROW; i++) {
                    for (int j = 0; j < COL; j++) {
                        s[i][j] = a[i][j] + b[i][j];
                        System.out.print(s[i][j] +" ");
                    }
                    System.out.println();

                }
    }
     public void solution38(){
        String str, rev = "";
        str = JOptionPane.showInputDialog("Enter any word to check");
        int length = str.length();

         for (int i = length-1; i>=0 ; i--) {
             rev = rev + str.charAt(i);
         }

         if(str.equals(rev)){
             System.out.println("It is Palindrome.");
         }
         else{
             System.out.println("It is not a Palindrome.");
         }
     }

        public void solution39(){

        String str = "";
        String t = "";
        str = JOptionPane.showInputDialog("Enter your full Name");
        int length = str.length();

            for (int i = 0; i < length-1; i++) {
                char ch = str.charAt(i);
                if (ch != ' '){
                    t = t + ch;
                }
                else{
                    System.out.println(Character.toUpperCase(str.charAt(0)) + ". " );
                }

            }


        }
        public void solution40(){

        String str = "";
        str = JOptionPane.showInputDialog("Enter any word to reverse");
        int length = str.length();
        String rev = "";

            for (int i = length-1; i >=0 ; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println("" +rev);
        }


}

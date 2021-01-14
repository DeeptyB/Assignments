package Assignment;

import javax.swing.*;

public class Solution29to40 {

    public static void main(String[] args) {
            Solution29to40 obj = new Solution29to40();
            //obj.solution29();
        //obj.solution30();
        obj.solution31();
    }

    public void solution29(){
        int i;
        double fact = 1.0;
        double a = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));

        for(i=1;i<=n;i++){

            for(int j=1; j<=i;j++){
                fact = fact*j;
            }
            a = a + (i/fact);

        }
        System.out.println("The solution is " + a);
    }

    public void solution30(){

        int count = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
        int n1 = 0, n2 = 1, n3 ,i;
        System.out.print( " " +n2);
        for(i = 2; i<=count;++i){
            n3 = n1 + n2;
            System.out.print(" " +n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public void solution31(){
        int i,j;
        int row = 5;
         for(i=1;i<=row;i++){
             for(j=1;j<=i;j++){
                 System.out.print(j+"");
             }
             System.out.println();
         }

    }
}

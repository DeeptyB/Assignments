package Assignment;

import javax.swing.*;
import java.io.*;
import java.util.*;


public class Solution41to45 {
    public static void main(String[] args) throws IOException {
        Solution41to45 obj = new Solution41to45();
        //obj.solution41();
        //obj.solution42();
        //obj.solution43();
        //obj.solution44();
        obj.solution45();

    }

    public void solution41() {
        String word = JOptionPane.showInputDialog("Enter any word");
        int count;

        word = word.toLowerCase();
        String letters[] = word.split("");
        System.out.println("Duplicate words in a given word : ");
        for (int i = 0; i < letters.length; i++) {
            count = 1;
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i].equals(letters[j])) {
                    count++;
                    letters[j] = "0";
                }
            }
            if (count > 1 && letters[i] != "0")
                System.out.println(letters[i]);
        }

    }

    public void solution42() {

        String word = JOptionPane.showInputDialog("Enter any word");
        int count;

        word = word.toLowerCase();
        String letters[] = word.split("");
        System.out.println("Duplicate words in a given word : ");
        for (int i = 0; i < letters.length; i++) {
            count = 1;
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i].equals(letters[j])) {
                    count++;
                    letters[j] = "0";
                }
            }
            if (count > 1 && letters[i] != "0")
                System.out.println(letters[i]);
        }
    }

    public void solution43() {
        try {
            int arr[] = new int[10];
            arr[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(
                    "Any Number cannot be divided by Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Out of Index in Array");
        }
    }

    public void solution44() {
        try {
            File f = new File("C:\\Users\\deept\\OneDrive\\Desktop\\Java\\student.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("C:\\Users\\deept\\OneDrive\\Desktop\\Java\\student.txt");
            for (int i = 0; i < 10; i++) {
                int a = i+1;
                output.write(JOptionPane.showInputDialog("Please Enter Name of the Student " +a+ " " ));
                output.write(JOptionPane.showInputDialog("Please Enter Address of the Student " +a+ " "));
            }
            System.out.println("Data is written to the file.");
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void solution45() throws IOException {
        String line, word = "";
        int count = 0;
        ArrayList<String> words = new ArrayList<String>();

        //Opens file in read mode
        FileReader file = new FileReader("C:\\Users\\deept\\OneDrive\\Desktop\\Java\\File Reader.txt");
        BufferedReader br = new BufferedReader(file);

        //Reads each line
        while((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().split("([,.\\s]+) ");
            //Adding all words generated in previous step into words
            for(String s : string){
                words.add(s);
                System.out.println("" +word);
            }
        }

        //Determine the most repeated word in a file
        for(int i = 0; i < words.size(); i++){
            count = 1;
            //Count each word in the file and store it in variable count
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }
            //If maxCount is less than count then store value of count in maxCount
            //and corresponding word to variable word
            if(count >=2){
                word = words.get(i);
                System.out.println("The Duplicated Words are: " + word);
            }
        }

        br.close();
    }
}




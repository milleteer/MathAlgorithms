package MultipliesOfANumber;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Greg Koles on 27/03/2015.
 */
public class MultipliesOfANumber {


    private int NumToCompare;
    private int Base;

    public static void main(String[] args) {

        MultipliesOfANumber m = new MultipliesOfANumber();
        m.ReadInputs("c:\\Users\\Greg Koles\\IdeaProjects\\MathAlgorithms\\src\\MultipliesOfANumber\\input.txt");

    }


    protected void ReadInputs(String FilePath){

            Scanner s = this.createScanner(FilePath);

            while (s.hasNextLine()){

                this.processLine(s.nextLine());
                this.CompareTwoNumbers();
            }
    }

    private Scanner createScanner(String FilePath){

        try {

            InputStream i = new FileInputStream(FilePath);
            return new Scanner(i);
        }
        catch (IOException e1) {

            e1.printStackTrace();
            return null;
        }

    }

    protected int CompareTwoNumbers() {

        int power = (int) Math.sqrt(this.getBase());

        // start trying from the base power +1
        //eg. 8 = 2^3 --> start from 16 = 2^4
        if (this.getBase() >= this.getNumToCompare())
        {
            System.out.println(this.getBase());
            return this.getBase();

        }
        else {

            while (this.getBase() < this.getNumToCompare()) {

                this.setBase(this.getBase() * 2);

            }

            System.out.println(this.getBase());
            return this.getBase();

        }
    }

    private boolean processLine(String LineToRead) {

        try {

            Scanner s = new Scanner(LineToRead);
            s.useDelimiter(",");

            this.setNumToCompare(Integer.valueOf(s.next()));
            return this.setBase(Integer.valueOf(s.next()));

            // System.out.println(this.getNumToCompare());
            // System.out.println(this.getBase());
        } catch (NumberFormatException e) {


            System.out.println("Base cannot be minus");
            return false;
            
        }
    }



    public int getNumToCompare() {
        return NumToCompare;
    }

    public void setNumToCompare(int numToCompare) {
        NumToCompare = numToCompare;
    }

    public int getBase() {
        return Base;
    }

    public boolean setBase(int base){

        if(base <= 0){
            System.out.println("Base set to: " + this.getBase());
            return false;
        }
        else if(base % 2 == 0){
            this.Base = base;
            return true;
        }

        else return false;

    }
}

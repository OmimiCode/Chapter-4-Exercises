package Chapter4;

import javax.swing.*;

public class Palindrome {

    private int input;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public void input() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("enter 5-digit palindromic integers"));
        while (Integer.toString(input).length() != 5) {
            System.out.println("please enter 5-digit integers");
            input = Integer.parseInt(JOptionPane.showInputDialog("enter 5-digit palindromic integers"));
        }
            this.input = input;
        }

    public int getInput() {
        return input;
    }

    public void isPalindromic() {
        if (Integer.toString(input).length() == 5) {
            a = input / 10000;
            int ai = input % 10000;
            b = ai / 1000;
            int bi = ai % 1000;
            c = bi / 100;
            int ci = bi % 100;
            d = ci / 10;
            int di = ci % 10;
            e = di / 1;
        } else {
            System.out.println("your input is not a 5-digit");
        }
    }

    public int getIsPalindromic() {
        if (a == e && b == d /*&& c!=a && c!=b && c!=d && c!=e*/) {
            System.out.println("your input is palindromic!");
        } else {
            System.out.println("NOT PALINDROMIC");

        }
        return 0;
    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.input();
        palindrome.isPalindromic();
        palindrome.getIsPalindromic();

    }
}


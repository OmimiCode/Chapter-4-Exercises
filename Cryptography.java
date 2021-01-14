package Chapter4;

import javax.swing.*;
import java.util.Arrays;

public class Cryptography {

    private int userInput;
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;


    public void userInput() {
        this.userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        }
    }

    public int getUserInput() {
        return userInput;
    }

//shredding the user input into single digit

    public void firstDigit() {// userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
     userInput();
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        }
        this.firstDigit = userInput / 1000;
    }

    public int getFirstDigit() {
        return firstDigit;
    }


    public void secondDigit() {
        userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        }
        int secondMod = userInput % 1000;
        this.secondDigit = secondMod / 100;
    }

    public int getSecondDigit() {
        return secondDigit;
    }

    public void thirdDigit() {
        userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        }
        int thirdMod = userInput % 100;
        this.thirdDigit = thirdMod / 10;
    }

    public int getThirdDigit() {
        return thirdDigit;
    }

    public void fourthDigit() {
        userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        }
        this.fourthDigit = userInput % 10;
    }

    public int getFourthDigit() {
        return fourthDigit;
    }


    // method to encrypt Stage 1 (digit + 7 % 10)
    public void encrypt() {
        userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE ENCRYPTED"));
        }

        this.firstDigit = userInput / 1000;
        int secondMod = userInput % 1000;
        this.secondDigit = secondMod / 100;
        int thirdMod = userInput % 100;
        this.thirdDigit = thirdMod / 10;
        this.fourthDigit = userInput % 10;

        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;

        System.out.printf("encrypted : %d%d%d%d", thirdDigit, fourthDigit, firstDigit, secondDigit);

    }

    public int getEncryption() {
       return 0;
    }
    public void decrypt() {
        userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE DECRYPTED"));
        while (Integer.toString(userInput).length() != 4) {
            System.out.println("please you can only enter 4-digit, try Again");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER 4 DIGIT INTEGERS TO BE DECRYPTED"));
        }
// shred encrypted to be able to decrypt
        this.firstDigit = userInput / 1000;
        int secondMod = userInput % 1000;
        this.secondDigit = secondMod / 100;
        int thirdMod = userInput % 100;
        this.thirdDigit = thirdMod / 10;
        this.fourthDigit = userInput % 10;

        if( firstDigit < 7 )
            firstDigit += 10;
        if( secondDigit < 7 )
            secondDigit += 10;
        if( thirdDigit < 7 )
            thirdDigit += 10;
        if( fourthDigit < 7 )
            fourthDigit+= 10;

        firstDigit = firstDigit - 7;
        secondDigit = secondDigit - 7;
        thirdDigit = thirdDigit - 7;
        fourthDigit = fourthDigit - 7;

        System.out.printf("decrypted : %d%d%d%d", thirdDigit, fourthDigit, firstDigit, secondDigit);

    }



// main method
    public static void main(String[] args) {
Cryptography cryptography = new Cryptography();
//cryptography.userInput();
//cryptography.firstDigit();
//cryptography.secondDigit();
//cryptography.thirdDigit();
//cryptography.fourthDigit();
cryptography.encrypt();
System.out.println();
cryptography.decrypt();

    }
}
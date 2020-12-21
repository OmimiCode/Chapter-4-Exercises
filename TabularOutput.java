package Chapter4;

import javax.swing.*;

public class TabularOutput {
    private int input;

    public void input() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("enter input "));
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public void methodToLoopCounter() {
        System.out.println("\t"+ "N" + "\t" + "\t" + "N*10" + "\t" +  "N*100" + "\t"  +  "N*1000"+ "\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t" + i + "\t" +"\t" +  i*10 + "\t" + "\t" + i*100 + "\t" +"\t" +  i*1000);
        }
    }

    public int getMethodToLoopCounter() {
        return 0;
    }


    public static void main(String[] args) {
        TabularOutput tabularOutput = new TabularOutput();

        tabularOutput.methodToLoopCounter();

    }
}
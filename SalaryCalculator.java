package Chapter4;

import javax.swing.*;
import java.util.Arrays;

public class SalaryCalculator {

    private int employeeID;
    private double hourlyRate;
    private int hoursWorked;
    private int i;

    public void setEmployeeID() {
        int employeeId = Integer.parseInt(JOptionPane.showInputDialog("ENTER EMPLOYEE IDENTITY NUMBER"));
        this.employeeID = employeeId;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setHourlyRate() {
        double hourlyRate = Integer.parseInt(JOptionPane.showInputDialog("ENTER COMPANY'S HOURLY RATE"));
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked() {
        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("ENTER EMPLOYEE HOURS" + i + "WORKED"));
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }


    public void setGrossPayCalculationMethod() {
    }

    public double getGrossPayCalculationMethod() {
        double grossPay;
        if (hoursWorked <= 40) {
            grossPay = hoursWorked * hourlyRate;
        } else {
            System.out.println(" Overtime Noticed" /* your gross pay is*/);
            double overTime = hoursWorked - 40;
            double extraPay = overTime*(hourlyRate*1.5);
            double normalSalary = 40 * hourlyRate;
            grossPay = normalSalary + extraPay;
        }
        return grossPay;
    }


    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        salaryCalculator.setHourlyRate();
        System.out.println("THE COMPANY'S HOURLY RATE IS : " + salaryCalculator.getHourlyRate());


        for (int i = 1; i <= 3; i++) {
            salaryCalculator.setEmployeeID();
            salaryCalculator.setHoursWorked();

            System.out.println("    ");
            System.out.println("____________________employee " + i + "________________________");
            System.out.println("EMPLOYEE ID:" + salaryCalculator.getEmployeeID() + "\n" +
                    "HOURS WORKED: " + salaryCalculator.getHoursWorked() + "\n" +
                    "GROSS PAY: " + salaryCalculator.getGrossPayCalculationMethod());
            System.out.println("   ");

        }
    }

}







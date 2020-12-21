package Chapter4;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
public class SalesCommissionCalculator {
    /*4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
        total of $650. You’ve been supplied with a list of the items sold by each salesperson.
        The values of these items are as follows:
        Item       Value
        1         239.99
        2         129.75
        3         99.95
        4         350.89
        Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
        displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/

        private double inputItemSoldPrice;
        private double salary;
        double totalItemSold =0;
        public double  getCalcSalesCommission;
        private double salesCommission;

        int employeeID;
    private double  inputItemsSoldPrice;


    public void inputItemsSoldPrice() {
            this.inputItemSoldPrice = Integer.parseInt(JOptionPane.showInputDialog("ENTER ITEM SOLD PRICE OR -1 TO TERMINATE"));
        }

        public double getItemsInputPriceSold() {
            return inputItemSoldPrice;
        }

        public void setSalary() {
            this.salary = Integer.parseInt(JOptionPane.showInputDialog("ENTER EMPLOYEE SALARY"));
        }

        public double getSalary() {
            return salary;
        }

        public double sumItemSold(){
            totalItemSold += inputItemSoldPrice;
            return totalItemSold;
        }


        public void  calcSalesCommission() {
        this.salesCommission = salary + (0.09*totalItemSold);
        }

        public double getCalcSalesCommission() {
            double salesCommission = salary + 0.09*totalItemSold;
        return salesCommission;
        }

        // main class
    public static void main(String... args) {
        SalesCommissionCalculator salesCommissionCalc = new SalesCommissionCalculator();
        Scanner scanner = new Scanner(System.in);
        int counter=1;
        System.out.println("ENTER EMPLOYEE ID TO INPUT SALES  OR -1 TO TERMINATE");
        int employeeID = scanner.nextInt();

        while(employeeID !=-1){
            System.out.println("SET EMPLOYEE SALARY");
            salesCommissionCalc.setSalary();
            System.out.println("SALARY PER WEEK : "+ salesCommissionCalc.getSalary());
            System.out.println("EMPLOYEE_ID : "+ employeeID);
            salesCommissionCalc.inputItemsSoldPrice();
            salesCommissionCalc.sumItemSold();
            System.out.println(counter + "      "+salesCommissionCalc.getItemsInputPriceSold());
            counter++;
            double sentinel = salesCommissionCalc.getItemsInputPriceSold();
            while (sentinel != -1){
                salesCommissionCalc.inputItemsSoldPrice();
                salesCommissionCalc.sumItemSold();
                System.out.println(counter+ "       "+salesCommissionCalc.getItemsInputPriceSold());
                counter++;

            }
            System.out.println("SALARY : "+ salesCommissionCalc.getSalary());
            System.out.println("TOTAL SALES : " + salesCommissionCalc.totalItemSold);
            System.out.println("COMMISSION: " + salesCommissionCalc.getCalcSalesCommission());
        }
    }
}

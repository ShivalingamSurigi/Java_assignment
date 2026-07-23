package ExceptionHandling;

import java.util.Scanner;

public class _18OnlineShopping {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Quantity:");
        String quantityStr=sc.nextLine();
        IO.print("Price:");
        String priceStr=sc.nextLine();
        int quantity=0;
        double price=0.0;
        //Parse and validate Quantity
        try {
            quantity=Integer.parseInt(quantityStr);
        }catch (NumberFormatException e){
            IO.println("Invalid Quantity.");
            sc.close();
            return;
        }
        try {
            price=Double.parseDouble(priceStr);
        }catch (NumberFormatException e){
            IO.println("Invalid Price.");
            sc.close();
            return;
        }
        double totalBill=quantity*price;
        IO.println("Total Bill:"+totalBill);
        sc.close();
    }
}

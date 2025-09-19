import java.util.Scanner;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
public class da7_homework {
    public static void main(String[]args){
        Scanner user_input=new Scanner(System.in);
        String items[]=new String[5];
        double discound=0;
        double discound_amount=0;
        int grandtotal=0;
        int[] quantities=new int[items.length];
        items[0]=("Rice");
        items[1]=("Sugar");
        items[2]=("Oil");
        items[3]=("Soap");
        items[4]=("milk");

        int prices[]=new int[5];
        prices[0]=50;
        prices[1]=40;
        prices[2]=100;
        prices[3]=25;
        prices[4]=30;

        System.out.println("Available items:");
        for(int i=0;i<items.length;i++){
            System.out.println((i+1)+"." +items[i]);
        }
        for (int j = 0; j < items.length; j++) {

        while (true) {
            try{
    System.out.println("Enter the quantity for " + items[j] + ":");
    quantities[j] = user_input.nextInt();
    if (quantities[j] < 0) {
    System.out.println(" Quantity cannot be negative. Try again.");
                continue;}
     
    
    int itemtotal = quantities[j] * prices[j]; 
    System.out.println("The total for " + items[j] + " is: Rs." + itemtotal);
    grandtotal+=quantities[j]*prices[j];
    break;}
    catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    user_input.nextLine();
                }
    }
        }
         System.out.println("The Grand total is: "+grandtotal);
       if(grandtotal>500){
         System.out.println("10% Discount is applied to your purchase");
         discound=grandtotal*0.10;
         discound_amount=grandtotal-=discound;
         System.out.println("The grandtotal after discount: "+("Rs.")+discound_amount);
       }
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("purchace date and time: " + formattedDate); 
    user_input.close();
    }
}

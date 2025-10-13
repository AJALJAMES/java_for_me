import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int number=input.nextInt();
for(int i=1;i<=10;i++){
System.out.println(number+"x"+i+"="+(number*i));
}
input.close();
}
}
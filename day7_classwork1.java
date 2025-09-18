import java.util.Scanner;
import java.time.LocalDateTime;
public class day7_classwork1 {

    public static void main(String[]args){
    Scanner numstu=new Scanner(System.in);
    System.out.println("Enter the number of Students:");
    int numstudent= numstu.nextInt();
    numstu.nextLine();

    String[]stuname=new String[numstudent];
    int[]stumark=new int[numstudent];
    int total=0;
    double avg=0;

    for(int i=0;i<numstudent;i++){
        System.out.println("Enter Students name:"+(i+1));
        stuname[i]=numstu.nextLine();
    }
      for(int j=0;j<numstudent;j++){
        System.out.println("Enter the marks:"+(j+1));
        stumark[j]=numstu.nextInt(); 
         if(stumark[j]<35){
            System.out.println("Need Improvement");
        }   
            total+=stumark[j];
        }
            avg=total/stumark.length;
            System.out.println("the average mark is:" +avg);
            LocalDateTime curDateTime=LocalDateTime.now();
            System.out.println(curDateTime);
            numstu.close();
            
    
       
    }

}

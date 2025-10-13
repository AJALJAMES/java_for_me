import java.util.Scanner;
public class student_id {
    public static void main(String[] args) {
        String[][]stu_id={
            {"1","Rajesh"},
            {"2","Rahul"},
            {"3","Sruthi"}
        };
        Scanner input=new Scanner(System.in);
          System.out.println("Enter the Student ID:");
            int id=input.nextInt();
            String idstr=String.valueOf(id);
            boolean found=false;
        for(int i=0;i<stu_id.length;i++){
            if(stu_id[i][0].equals(idstr)){
            System.out.println("ID:"+stu_id[i][0]+","+"Student name:"+stu_id[i][1]);
            found =true;
            break;
            }
        }
         if(!found){
                System.out.println("Invalid ID");
            }
         input.close();
    }
}

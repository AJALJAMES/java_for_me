public class day6_task2 {
    public static void main(String[]args){
        double average=0;
        int total=0;
        int[]marks= {78,82,91,65,34};

        for(int i=0;i<marks.length;i++){
             total+=marks[i];
               average=total/marks.length;
               if(marks[i]<=35){
                System.out.println("Fail");
                   break;
               }
    }
             System.out.println("The total marks is:" +total);
             System.out.println("The average is:"+average);

             if(average>=90){
                System.out.println("Grade:A");
             }
             else if(average>=75 && average<=89){
                System.out. println("Grade:B");
             }
              else if(average>=60 && average<=74){
                System.out.println("Grade:C");
              }
              else if(average<60){
                System.out.println("Grade:D");}
        }
    }



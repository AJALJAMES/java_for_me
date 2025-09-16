public class class_test {
    public static void main (String[]args){
    int stu[]=new int[5];
    stu[0]=90;
    stu[1]=85;
    stu[2]=60;
    stu[3]=50;
    stu[4]=25;
    for(int i=0;i<stu.length;i++){
      if(stu[i]>=90){
        System.out.println("Excellent");
      }
      else if(stu[i]>=75 && stu[i]<=89){
        System.out.println("Good");
      }
       else if(stu[i]>=50 && stu[i]<=74){
        System.out.println("Average");
      }
      else{System.out.println("Fail");}
    }
}
}

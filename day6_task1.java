public class day6_task1 {
    public static void main(String[]args){
    int item[]=new int[5];
    int sum=0;
    item[0]=20;
    item[1]=15;
    item[2]=30;
    item[3]=0;
    item[4]=25;
    for(int i=0;i<item.length;i++){
      if(item[i]==0){
        System.out.println("Out of stock");
        break;
      }
      sum+=item[i];
    }
    System.out.println("total is:"+sum);
    if(sum<50){
     System.out.println("Low stock");
    }
    else if(sum>50 && sum<=100){
     System.out.println("Moderate");
    }
    else{System.out.println("Good stock");}
}
}
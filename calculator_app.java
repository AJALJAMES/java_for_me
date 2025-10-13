import java.util.Scanner;
 class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
       return a-b;  
    }
    public int mul(int a,int b){
       return a*b;
    }
    public double div(int a,int b){
       if(b==0){
        System.out.println("0 cannot be divided");
       }
       return a/b;
    }
}
public class calculator_app {
   public static void main(String[] args) {
      Calculator cal=new Calculator();
      Scanner ip=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int num1=ip.nextInt();
      System.out.println("Choose the operator(+,-,*,/):");
      char op=ip.next().charAt(0);
      System.out.println("Enter the Second number:");
      int num2=ip.nextInt();
      int result=0;
      boolean valid=true;
      switch(op){
            case'+':result=cal.add(num1,num2);
            break;
            case'-':result=cal.sub(num1,num2);
            break;
            case'*':result=cal.mul(num1,num2);
            break;
            case'/':result=cal.div(num1,num2);
            break;
            default:System.out.println("Invalid Operator");
            valid=false;
            }
             if(valid){
               System.out.println("Result:"+result);
      }
   }
}

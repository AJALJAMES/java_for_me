import java.util.Scanner;
abstract class Ride{
abstract int Calculate_fare(int distance);
public void ride_Type(){
    System.out.println("Generic Ride");
}
}
class Auto_ride extends Ride{
int Calculate_fare(int distance){
    return distance*10;
}
public void ride_Type(){
    System.out.println("Auto Ride");
}
}
class Car_ride extends Ride{
    int Calculate_fare(int distance){
        return distance*20;
    }
    public void ride_Type(){
        System.out.println("Car Ride");
    }
}
public class Booking_App{
    public static void main(String[] args) {
     Scanner User_input=new Scanner(System.in);
     System.out.println("Choose Auto or Car");
     String auto_car=User_input.nextLine().trim().toLowerCase();
     int dis_travel=0;
     try{
     System.out.println("Enter the distance to travel(in +ve number)");
      dis_travel=User_input.nextInt();
     User_input.nextLine();
      User_input.close();
     if(dis_travel<0){
       throw new NumberFormatException("Enter a +ve number");
       
     }
     }
     catch(NumberFormatException n){
        System.out.println(n.getMessage());
        return;
     }
     Ride ride;
     switch (auto_car) {
        case "auto":
            ride=new Auto_ride();
            break;
        case "car":
            ride=new Car_ride();
            break;
        default:
        System.out.println("Invalid ride type");
        User_input.close();
        return;
     }
     ride.ride_Type();
     int fare=ride.Calculate_fare(dis_travel);
     System.out.println("Toal fare:"+fare);
     }
    }


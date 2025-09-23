abstract class user{
    abstract void showMessage();
    public void displayUserType(){
      System.out.println("User type selected");
    }
}
class AdminUser extends user{
    public void showMessage(){
        System.out.println("Welcome,Admin");
    }
}
class Guestuser extends user{
    public void showMessage(){
        System.out.println("Welcome,Guest");
    }
}

public class User_test {
public static void main(String[] args) {
    AdminUser au=new AdminUser();
    au.displayUserType();
    au.showMessage();

    Guestuser gu=new Guestuser();
    gu.displayUserType();
    gu.showMessage();
}
}
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Con_checker {
    public void name_inputs(){
    Scanner input=new Scanner(System.in);
    Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z ]*$");
    System.out.println("Enter the name:");
    String name=input.nextLine();
    Matcher match=pattern.matcher(name);
    boolean matchfound=match.matches();
    if(matchfound){
        System.out.println("Name:"+name);
    } 
    else{
        System.out.println("Invalid name.Please start with an uppercase letter and use only letters or spaces—no digits allowed.");
    }

  
    Pattern email_pattern=Pattern.compile("^(?![.@])[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}(?<![.@])$");
    System.out.println("Enter the emai id:");
    String email=input.nextLine();
    Matcher email_matcher=email_pattern.matcher(email);
    boolean email_matchfound=email_matcher.matches();
    if(email_matchfound){
      System.out.println("email:"+email);
    }
    else{
        System.out.println("Invalid email id");
    }

    Pattern num_pattern=Pattern.compile("\\b\\d{10}\\b");
    System.out.println("Enter the Mobile number:");
    String num=input.next();
    Matcher num_matcher=num_pattern.matcher(num);
    boolean num_matchfound=num_matcher.matches();
    if(num_matchfound){
       System.out.println("Mobile number:"+num);
    }
    else{
        System.out.println("Invalid number");
    }

    input.close();
    }
    public static void main(String[] args) {
        Con_checker check=new Con_checker();
        check.name_inputs();
    }
}

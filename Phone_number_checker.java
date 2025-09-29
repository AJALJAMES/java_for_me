import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Phone_number_checker{
    @SuppressWarnings("Unchecked")
    public void fnum(String message){
    Pattern pat=Pattern.compile("\\b\\d{10}\\b");
    Matcher match= pat.matcher(message);
    Boolean find=false;
    while(match.find()){
        System.out.println("Number found:"+match.group());
        find=true;
    }
    if(!find){
        System.out.println("Number not found");
    }
    }
    public static void main(String[] args) {
        String message="The numbers are 9539205186 and 9567241555";
        Phone_number_checker check=new Phone_number_checker();
        check.fnum(message);
    }
}



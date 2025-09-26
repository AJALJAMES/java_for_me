import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class book_store {
    public static void main(String[] args) {
        String data="Book order placed at";
        File file=new File("log.txt");

        try{
            FileWriter writer=new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("File written Successfully");
        }
        catch(Exception e){
            System.out.println("An error occured while writting file"+e.getMessage());
        }

        try{
            FileReader read=new FileReader(file);
            read.close();
            System.out.println("File read Successfully"+data);
        }
        catch(Exception e){
            System.out.println("An error occured during reading the file"+e.getMessage());
        }
        boolean value=file.delete();
        if(value){
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("An error occured during deleting the file");
        }
    }
}

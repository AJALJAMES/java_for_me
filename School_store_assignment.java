import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
//import java.io.BufferedReader;
public class School_store_assignment{
    public static void main(String[] args) {
        String data="Java File Handling Practice";
        File file=new File("assignment.txt");

        try{
           FileWriter writer_data=new FileWriter(file);
           writer_data.write(data);
           writer_data.close();
           System.out.println("File write Successfully");
        }
        catch(Exception e){
          System.out.println("error occur during write"+e.getMessage());
        }
        
        try{
            FileReader read_file=new FileReader(file);
            System.out.println("File content:"+data);
            read_file.close();
        }
        catch(Exception e){
            System.out.println("An error occur during read"+e.getMessage());
        }
        boolean value=file.delete();
        if(value){
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("An error occur during deleting file");
        }
    }
}
class employee{
   private String Name;
  private  int Id_number;
   private String Department;
   private double Salary;
public String getName(){
    return Name;
}
public int getId_number(){
    return Id_number;
}
public String getDepartment(){
    return Department;
}
public double getSalary(){
    return Salary;
}
public void setName(String Name){
    this.Name=Name;
}
public void setId_number(int Id_number){
    this.Id_number=Id_number;
}
public void setDepartment(String Department){
    this.Department=Department;
}
public void setSalary(double Salary){
    this.Salary=Salary;
}
public class Employee_test{
    public static void main(String[] args) {
        employee e1=new employee();
        employee e2=new employee();

        e1.setName("Ajal");
        e1.setId_number(01);
        e1.setDepartment("IT");
        e1.setSalary(50000);

        e2.setName("Bjal");
        e2.setId_number(02);
        e2.setDepartment("Sales");
        e2.setSalary(25000);

        System.out.println("Details Of Employee 1");
        System.out.println("Name:"+e1.getName());
        System.out.println("Id_number:"+e1.getId_number());
        System.out.println("Department:"+e1.getDepartment());
        System.out.println("Salary:"+e1.getSalary());

        System.out.println("Details Of Employee 2");
        System.out.println("Name:"+e2.getName());
        System.out.println("Id_number:"+e2.getId_number());
        System.out.println("Department:"+e2.getDepartment());
        System.out.println("Salary:"+e2.getSalary());
    }
}
}

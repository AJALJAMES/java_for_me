class my_course{
    String name;
    int duration;
    int number_of_students_enrolled;
    public static int track=0;
    my_course(String name,int duration,int number_of_students_enrolled){
        this.name=name;
        this.duration=duration;
        this.number_of_students_enrolled=number_of_students_enrolled;
        track+=number_of_students_enrolled;
    }
    
    class platform{
        final String course_created_by="CodeMentor Academy";
        public void display(){
          System.out.println("Courses are hosted on CodeMentor");  
        }
    }
public class Course_test{
public static void main(String[] args) {
    my_course c1=new my_course("Java",6,7);
    my_course c2=new my_course("Python",8,10);
    my_course.platform cp1=c1.new platform();
    my_course.platform cp2=c1.new platform();
    System.out.println("Details of java course");
    System.out.println("Name:"+c1.name);
    System.out.println("Duration:"+c1.duration+" weeks");
   System.out.println("Number_of students enrolled:"+c1.number_of_students_enrolled);
    System.out.println("Course created by:"+cp1.course_created_by);

    System.out.println("Details of python course");
    System.out.println("Name:"+c2.name);
    System.out.println("Duration:"+c2.duration+" weeks");
    System.out.println("Number_of students enrolled:"+c2.number_of_students_enrolled);
    System.out.println("Course created by:"+cp1.course_created_by);
    cp2.display();
    System.out.println("Total number of students enrolled in both courses:"+track);
    
}
    
}
}
class course{
       String course_name;
        int course_duration;
        public static int track=0;
class course_materials{
    final String Training_center="Bijus Training Center";
    public void display(){
        System.out.println("Materials provided for this course.");
    }
}
    course(){
          course_name="python";
          course_duration=6;
          track++;
          
    }
    course(String course_name,int course_duration){
           this.course_name=course_name;
           this.course_duration=course_duration;
           track++;
             
    }
    public class Training_center{
        public static void main(String[] args) {
          
            course c1=new course();
            course c2=new course("java",6);
            course.course_materials cm1=c1.new course_materials();
            course.course_materials cm2=c2.new course_materials();

            System.out.println("first course:"+c1.course_name);
            System.out.println("first course_duration:"+c1.course_duration);
            cm1.display();
            System.out.println("Second course:"+c2.course_name);
            System.out.println("Second course_duration:"+c2.course_duration);
            cm2.display();
            System.out.println(cm2.Training_center);
            System.out.println("Total course:"+track);

        }
    }

}

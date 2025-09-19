
     interface animals {
    public void makesound();
    public void move();
    }
     class bird implements animals{
        public void makesound(){
            System.out.println("Chirp");
        }
        public void move(){
            System.out.println("Fly");
        }}
     class dog implements animals{
        public void makesound(){
            System.out.println("Bark");
        }
        public void move(){
            System.out.println("Run");
        }}
        public class Zoo{
            public static void main(String[]args){
            bird b=new bird();
            dog d=new dog();
            b.makesound();
            b.move();
            d.makesound();
            d.move();
        }
        
    } 
    

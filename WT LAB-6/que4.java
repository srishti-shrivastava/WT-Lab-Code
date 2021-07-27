interface Motor {
    int capacity = 5;
    void run();
    void consume();
}

class WashingMachine implements Motor {
   public void run() {
       System.out.println("Washing Machine runs!");
   }
   
   public void consume() {
       System.out.println("Washing Machine consumes capacity : " + capacity);
   }
}
public class que4 {

   public static void main(String[] args) {
       WashingMachine wm = new WashingMachine();
       wm.run();
       wm.consume();
   }

}
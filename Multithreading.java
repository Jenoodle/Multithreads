
public class Multithreading {
    
    public static void main (String[] args) {

      for (int i = 0; i < 5; i++) {
        MultithreadThing myThing = new MultithreadThing();
        myThing.start();
      } 
      
      
      
       

    }
    
}

    public class MultithreadThing extends Thread {
    
        private int threadNumber;
        public MultithreadThing (int threadNumber) {
            this.threadNumber = threadNumber;
        }


        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.prinln(i + " from thread " + thread);

                try{
                    Thread.sleep(1000)
                } catch (InterruptedException e) {

                }
                }
        }
            
    
            
               
            }
        
    


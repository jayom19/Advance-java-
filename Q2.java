package assignment1;
class abc extends Thread
{

    @Override
    public void run() {
         for (int i = 1; i <=5; i++) {
             System.out.println("THREAD-->"+i);
             
             try {
                 sleep(1000);
             } catch (InterruptedException ex) {
                 System.getLogger(abc.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
             }
        }
    }
     
}
public class Q2 {
    public static void main(String[] args) {
        abc ob=new abc();
        ob.start();
       
        try {
            ob.join();
        } catch (InterruptedException ex) {
            System.getLogger(Q2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        System.out.println("Main method finish");
    }
    
}

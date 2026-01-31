package assignment1;

class abc extends Thread
{

    @Override
    public void run() {
        System.out.println("thread name->"+getName());
    }
     
}
class xyz implements Runnable
{

    @Override
    public void run() {
        System.out.println("Runnable thread");
    }
    
}
public class Q1 {
    public static void main(String[] args) {
        abc ob=new abc();
        ob.start();
        xyz ob1=new xyz();
        ob1.run();
        
    }
}

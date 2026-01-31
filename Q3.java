
package assignment1;
class table
{
    void printtable(int n)
    {
        for (int i =1; i <=10; i++) {
            System.out.println(n+"  *"+i+" ="+i*n);
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        table t=new table();
        Thread t1=new Thread()
        {
            @Override
            public void run() {
              t.printtable(5);
                System.out.println("");
                System.out.println("");
              t.printtable(10);
                
            }
              
        };
        t1.start();
    }
    
}

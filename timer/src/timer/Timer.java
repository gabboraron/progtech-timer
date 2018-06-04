package timer;

import java.util.TimerTask;

/**
 *
 * @author Sándor
 */
public class Timer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        new java.util.Timer().schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println("Executed...");
               //your code here 
               //1000*5=5000 mlsec. i.e. 5 seconds. u can change accordngly 
            }
        },1000*5,1000*5); 


    }
    
}

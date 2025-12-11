import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);
        currentThread.setName("MainGuy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(currentThread);
        CustomThread t = new CustomThread();
        t.start();

        Runnable sample = ()->{
          for(int i=1;i<=3;i++){
              System.out.println(" 2 ");
              try{
                  TimeUnit.MILLISECONDS.sleep(250);
              }catch (Exception e){
                  e.printStackTrace();
              }
          }
        };

        Thread sampleThread = new Thread(sample);
        sampleThread.start();

        for(int i=1;i<=3;i++){
            System.out.println(" 0 ");
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public static void printThreadState(Thread thread){
        System.out.println("=======================");
        System.out.println("Thread ID: "+thread.getId());
        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread Priority: "+thread.getPriority());
        System.out.println("Thread State: "+thread.getState());
        System.out.println("Thread Group: "+thread.getThreadGroup());
        System.out.println("Thread is alive: "+thread.isAlive());
        System.out.println(thread.getClass());
        System.out.println("=======================");
    }
}

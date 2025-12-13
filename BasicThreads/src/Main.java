public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running");
        try {
            System.out.println("Main thread paused for one second");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(()->{
           String tname = Thread.currentThread().getName();
            System.out.println(tname+" should take 10 dots to run");
            for(int i=0;i<10;i++){
                System.out.print(". ");
                try{
                    Thread.sleep(500);
                    System.out.println("A. state = "+Thread.currentThread().getState());
                }catch (Exception e){
                    System.out.println(tname+" interrupted");
                    System.out.println("A1. State = "+Thread.currentThread().getState());
                    return;
                }
            }
            System.out.println("\n"+tname+" completed");
        });
        System.out.println(thread.getName()+" starting");
        thread.start();

        long now =System.currentTimeMillis();
        while(thread.isAlive()){
            System.out.println("\n waiting for thread to complete");
            try{
                Thread.sleep(1000);
                System.out.println("B. state = "+thread.getState());
                if(System.currentTimeMillis()-now>2000){
                    thread.interrupt();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("C. State = "+thread.getState());


    }
}

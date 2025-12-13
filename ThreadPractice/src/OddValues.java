public class OddValues extends Thread{

    @Override
    public void run() {
        for(int i=1;i<100;i++){
            if(i%2==1){
                System.out.println(i);
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
                if(i>5){
                    interrupt();
                }
            }
        }
    }
}

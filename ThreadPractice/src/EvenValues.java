public class EvenValues implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<100;i++){
            if(i%2==0){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
                   break;
                }
                if(i>=8){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

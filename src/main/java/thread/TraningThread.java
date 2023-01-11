package thread;

public class TraningThread extends MultiThread {
    public static int counter = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                     System.out.println("i = " + i);
                    counter = i;
                }
            }


        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("counter = " + counter);
    }
}


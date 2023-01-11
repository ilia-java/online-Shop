package thread;

public class MultiThread { //متد های مهم ترد :جوین  پرایرتی ران  استارت استت الایو
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("thread 1"));
        Thread t2 = new Thread(new MyRunnable("thread 2"));
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        do {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2 is alive = " + t2.isAlive());
            System.out.println("t1 is alive = " + t1.isAlive());
        } while (t1.isAlive() || t2.isAlive());
    }
}

class MyRunnable implements Runnable {
    private String ThreadName;

    public MyRunnable(String threadName) {
        ThreadName = threadName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i + "from " + " " + ThreadName);
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

    }
}




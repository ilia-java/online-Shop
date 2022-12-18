package thread;

public class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("salam");

                    }
                });
        //متد های مهم ترد :جوین  پرایرتی ران  استارت استت الایو
        System.out.println();
    }
}

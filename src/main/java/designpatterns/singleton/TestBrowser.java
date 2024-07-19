package designpatterns.singleton;

public class TestBrowser {
    public static void main(String[] args) {
        Browser.getInstance().display();

        /***  Singleton object under Multithread env ***/
        Runnable task = ()-> Browser_Multithread_Example .getInstance().display();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

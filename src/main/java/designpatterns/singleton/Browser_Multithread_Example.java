package designpatterns.singleton;

public class Browser_Multithread_Example {
    private static Browser_Multithread_Example browser;

    // create private constructor
    private Browser_Multithread_Example(){}

    //create static method to provide access to objects
    //synchronized method will cause perform this
    public  static Browser_Multithread_Example getInstance()
    {
        if(browser == null){
            synchronized (Browser_Multithread_Example.class){
                if(browser == null) {
                    browser = new Browser_Multithread_Example();
                }
            }
        }
       return browser;
    }
    public  void display()
    {
        System.out.println("Browser under multithread");
    }
}

package designpatterns.singleton;

public class Browser {

    // create private  static instance of browser class
    private static Browser browser;

    // create private constructor
    private Browser(){}

    //create static method to provide access to objects
    public static Browser getInstance()
    {
        if(browser == null){
            browser = new Browser();
        }
        return browser;
    }
    public  void display()
    {
        System.out.println("From Browser Class");
    }

    //create own methods
}

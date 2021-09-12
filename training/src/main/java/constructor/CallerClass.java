package constructor;

public class CallerClass{

    public static void main(String[] args) {
        //class name jiska methods call karne hai
        //uska nick name
        //=new this is main thing which creates object
        //ConsDemo(); -- constructor
        ConsDemo consDemo= new ConsDemo();
        ConsDemo.staticMethod();
        consDemo.nonStaticMethod();

        CallerClass aClass=  new CallerClass();


    }
}

package lambdademo;

public class LambdaDemo {
    public static void main(String[] args) {
        TestI test ;
        /*test= new A();
        test.show();*/
        test = () ->System.out.println("Hello,how are you?"); //lambda 
        test.show();
    }        
}
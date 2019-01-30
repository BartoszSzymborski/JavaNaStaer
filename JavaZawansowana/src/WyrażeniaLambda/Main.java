package WyrażeniaLambda;

public class Main {
    public static void main(String[] args) {
        Integer num = 5;
        num  = increment(num,x->x+1);
        System.out.println(num);
    }

    public static <T> T increment(T t, IncrementalPrinter<T> ip){
        return ip.doSomething(t);
    }
}

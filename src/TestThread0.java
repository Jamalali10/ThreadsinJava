public class TestThread0 {
    public static void main(String arg[]) {
        Mythread t1, t2;
        t1 = new Mythread();
        t2 = new Mythread();
        t1.start();
        t2.start();
    }
}

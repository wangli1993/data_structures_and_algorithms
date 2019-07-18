package data.filetest;

public class FileTest {
    public static boolean initFlag = false;

    static {
        System.out.println("***");
        Thread t = new Thread(() -> initFlag = true);
        System.out.println("111");
        t.start();
        System.out.println("222");
        System.out.println(initFlag);
        try {
            t.join();
            System.out.println("333");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(initFlag);
    }
}

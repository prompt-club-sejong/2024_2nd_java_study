package week_10.heonjin809.src;


public class ThreadExample {
    public static void main(String[] args) throws Exception {
        Thread thread = new MyThread();

        // thread 스레드 실행
        thread.start();

        // main 스레드 동작
        for (int i=0; i<10; i++) {
            System.out.println("Main");
        }
    }
}
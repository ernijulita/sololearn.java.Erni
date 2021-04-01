package exception.lists.threads.files;

public class threads2 {
    class A implements Runnable {
        public void run() {
            System.out.println("Bye");
        }
    }
    public class App {
        public static void main(String[ ] args) {
            Thread ob = new Thread(new A());

            ob.start();

        }

    }

}

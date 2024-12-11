public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Kubernetes and Docker!");
        while (true) {
            try {
                Thread.sleep(10000); // Keep the app running
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

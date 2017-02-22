import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        File file = new File("aaa");
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

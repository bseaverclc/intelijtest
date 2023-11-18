import java.io.File;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        Scanner scan = new Scanner(new File("files/numbers"));
        while(scan.hasNext()) {
            String stuff = scan.next();
            System.out.println(stuff);
        }

    }
}
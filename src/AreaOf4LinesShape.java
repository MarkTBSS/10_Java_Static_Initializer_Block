//import java.io.*;
import java.util.*;

public class AreaOf4LinesShape {
    public static void main(String[] args) {
        String mockInput = "-1\n" +
                        "3\n";
        Scanner scanner = new Scanner(mockInput);
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();
        int result = 0;
        String message = "";
        if (base > 0 && height > 0) {
            result = base * height;
            System.out.println(result);
        } else {
            message = "java.lang.Exception: " + 
            "Breadth and height must be positive";
            System.out.println(message);
        }
    }
}

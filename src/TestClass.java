import java.io.*;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
        String s = File.separator;
        String path = "file1";
        File file = new File(path);
        String path2 = "file2";
        File file2 = new File(path2);
        FileWriter writer = new FileWriter(file2, false);

        Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            int res = calculate(Integer.parseInt(words[0]), Integer.parseInt(words[1]));
            writer.write(String.valueOf(res));
            scanner.close();
            writer.close();
    }

    public static int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

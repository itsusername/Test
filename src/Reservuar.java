import java.util.Scanner;

public class Reservuar {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String count = countRes();
        String[] vol = inputVolume().split(" ");

        int max = Integer.parseInt(vol[0]);
        int maxIndex = 0;
        for (int index = 0; index < vol.length; index++) {
            if (Integer.parseInt(vol[index]) > max) {
                max = Integer.parseInt(vol[index]);
                maxIndex = index;
            }
        }


        if (maxIndex != 0) {
            int result = max - Integer.parseInt(vol[maxIndex - 1]);
            int sum = 0;
            int[] n = new int[Integer.parseInt(count)];
            for (int i = 0; i <= Integer.parseInt(count)-1; i++) {
                if (Integer.parseInt(vol[i]) < max && i < maxIndex) {
                    sum = Integer.parseInt(vol[i]) + result;
                } else {
                    sum = Integer.parseInt(vol[i]);
                }
                n[i] = sum;
            }
            calculate(count, n, result);
        } else {
            System.out.println(-1);
        }
    }

    public static String countRes() {
        return in.nextLine();
    }

    public static String inputVolume() {
        return in.nextLine();
    }

    public static int calculate(String count, int[] n, int result) {
        for (int i = 0; i < Integer.parseInt(count) - 1; i++) {
            if (n[i] != n[i+1]) {
                System.out.println(-1);
                return -1;
            }
        }
        System.out.println(result);
        return result;
    }
}

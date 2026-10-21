import java.io.*;
import java.util.*;

public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            String binaryNum = Integer.toBinaryString(num);
            int currentLength = binaryNum.length();
            int targetLength = (int) Math.ceil(currentLength / 4.0) * 4;

            String paddedStr = String.format("%" + targetLength + "s", binaryNum).replace(' ', '0');
            String chunkedStr = paddedStr.replaceAll("(.{4})", "$1 ").trim();
            System.out.println(chunkedStr);
        }

    }
}

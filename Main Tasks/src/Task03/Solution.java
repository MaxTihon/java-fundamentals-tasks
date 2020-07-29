package Task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(reader.readLine());

        printInline(quantity);
        printNewLine(quantity);
    }

    private static int getRandomInt() {
        return new Random().nextInt();
    }

    private static void printInline(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print(getRandomInt() + " ");
        }
        System.out.println();
    }

    private static void printNewLine(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(getRandomInt());
        }
    }

}

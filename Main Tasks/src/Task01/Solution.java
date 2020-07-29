package Task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = reader.readLine();

        greeting(userName);
    }

    private static void greeting(String userName) {
        System.out.println("Hello, " + userName + "!");
    }

}

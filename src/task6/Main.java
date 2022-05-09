package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Printer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Printer p = new Printer();
        p.print(br.readLine());


    }
}

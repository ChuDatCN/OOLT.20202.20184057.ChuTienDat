package hust.soict.globalict.garbage;

import java.io.File;
import java.util.Scanner;

public class NoGarbage {
    public static void main(String[] args) {
        File file = new File("src\\hust\\soict\\globalict\\resources\\garbage.txt");
        try {
            Scanner scan = new Scanner(file);
            StringBuilder s = new StringBuilder();
            while(scan.hasNextLine()) {
                s.append(scan.nextLine());
            }
            scan.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
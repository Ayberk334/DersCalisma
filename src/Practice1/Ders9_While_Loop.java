package Practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ders9_While_Loop {
    public static void main(String[] args) {

        String sentence = "flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);
        ArrayList words = new ArrayList();

        while (scan.hasNext()) {
            words.add(scan.next());
        }

        System.out.println(words);









    }
}

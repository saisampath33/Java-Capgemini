package Exceptional_Handling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsCheckedException {

    // Checked exception -> MUST be declared using throws
    public static void m1() throws IOException {
        FileReader fr = new FileReader("abc.txt"); // if file not found -> IOException
        System.out.println("File opened");
        fr.close();
    }

    public static void m2() {
        try {
            m1();
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        m2();
    }
}

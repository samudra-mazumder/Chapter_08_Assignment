package problem_04;

import java.util.Scanner;

public class Reader {
    private Scanner scanner;
    private String currentElement;

    public Reader() {
        scanner = new Scanner(System.in);
        currentElement = null;
    }

    public boolean hasMoreElements() {
        if (currentElement == null || scanner.hasNext()) {
            return true;
        }
        return false;
    }

    public String getCurrent() {
        return currentElement;
    }

    public void next() {
        if (scanner.hasNext()) {
            currentElement = scanner.next();
        } else {
            currentElement = null;
        }
    }
}
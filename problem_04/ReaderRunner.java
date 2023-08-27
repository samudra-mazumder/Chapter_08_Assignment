package problem_04;

public class ReaderRunner {
    public static void main(String[] args) {

        Reader reader = new Reader();

        while (reader.hasMoreElements()) {
            reader.next();
            if(reader.getCurrent().equals("Exit")){
                break;
            }
            System.out.println("Current Element: " + reader.getCurrent());


        }
    }
}
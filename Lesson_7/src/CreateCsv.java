import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCsv {
    public static void main(String[] args) {
        try { FileWriter writer = new FileWriter("names.txt");
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("James");
            bwr.write("\n");
            bwr.write("Hobert");
            bwr.close();
            System.out.println("succesfully written to a file");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
 AppData m= new AppData();
        m.add(0,"Value");
    }
}



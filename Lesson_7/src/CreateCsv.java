import java.io.*;
import java.util.Arrays;

public class CreateCsv {
    public static void main(String[] args) {

        AppData newData = new AppData();
        BufferedWriter bw = null;
        try {
            File file = new File("C:\\Users\\Svetlana\\myJavaProject\\Lesson_7//GDP.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(Arrays.toString(newData.getHeader()).replaceAll(",", ";"));
            bw.newLine();
            for (int[] m : newData.getData()) {
                bw.write(Arrays.toString(m).replaceAll(",", ";"));
                bw.newLine();
            }
            bw.newLine();


            System.out.println("File written Successfully");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
        
        File file = new File("C:\\Users\\Svetlana\\myJavaProject\\Lesson_7//GDP.txt");

        String line;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

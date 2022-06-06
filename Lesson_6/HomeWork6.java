public class HomeWork6 {


    public static void main(String[] args) {
        String[][] m = {
                {"A", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        try {
            try {

                System.out.println(Array.array(m));
            } catch (MyArrayDataException e) {
                System.out.println("Wrong data in array");
                System.out.println("Mistake in: " + e.i + "x" + e.j);
            }

        } catch (MyArraySizeException e) {

            System.out.println("Wrong size of array");
        }
    }

}

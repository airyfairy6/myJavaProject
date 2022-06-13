import java.util.*;

public class HomeWork8 {
    public static void main(String[] args) {
            HashMap <Integer,String>  book = new HashMap<Integer,String>();
            book.put(111,"Ivanov");
            book.put(222, "Petrov");
            book.put(333, "Ivanov");
            book.put(444, "Sidorov");

        for (HashMap.Entry<Integer, String> o : book.entrySet()) {
            System.out.println(o.getValue()+ ": " +o.getKey());
        }

        System.out.println();
 //ЗАДАНИЕ 1
        String arr[] = new String[]{"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November",
                "December", "January", "March", "March"};
        Set setUnique = new HashSet();
        Set setFrequency = new HashSet();

        List<String> listFriquency = Arrays.asList(arr);
        int i = 0;

        for (i = 0; i < arr.length - 1; i++) {
            if (!setUnique.contains(arr[i])) {
                setUnique.add(arr[i]);
            } else {
                setFrequency.add(arr[i]);
            }
        }
        System.out.println("Unique list (one time mentioned): " + setUnique);
        System.out.println("Repeated words: " + setFrequency);
        setFrequency.forEach((e) -> {
            System.out.println((e) + " " + Collections.frequency(listFriquency, e) + " time(s) repeated");
        });


    }
}


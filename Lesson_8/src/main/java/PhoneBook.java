import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public HashMap<Integer, String> book = create();

    public HashMap<Integer, String> create() {
        HashMap<Integer, String> book1 = new HashMap<Integer, String>();
        book1.put(11111, "Ivanov");
        book1.put(22222, "Petrov");
        book1.put(33333, "Petrov");
        book1.put(44444, "Romanov");
        return book1;
    }

    private String surname;
    private Integer phoneNumber;

    public PhoneBook() {

    }

    public PhoneBook(String surname) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;

    }


    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void get(String surname) {
        HashMap<Integer, String> map = book;
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        String desiredObject = surname;
        System.out.println("Phone number(s) by  surname: " + surname);
        for (Map.Entry<Integer, String> pair : entrySet) {
            if (desiredObject.equals(pair.getValue())) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }

    }

    public void add(Integer phoneNumber, String surname) {
        book.put(phoneNumber, surname);
        System.out.println("The PhoneBook with the added record: " + '\n' + book);


    }
}

import java.util.HashMap;

public class PhoneBook {
HashMap  <Integer, String> book = new HashMap<>();
    private String surname;
    private Integer phoneNumber;

    public PhoneBook(){

    }
    public PhoneBook (String surname){
        this.surname=surname;
        this.phoneNumber=phoneNumber;

    }


    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void get(String surname, Integer phoneNumber){
        for (HashMap.Entry<Integer, String> o : book.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
}
    public void add(String surname,Integer phoneNumber,HashMap<Integer, String> book){
        book.put(getPhoneNumber(), getSurname());
        for (HashMap.Entry<Integer, String> o : book.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

    }
}

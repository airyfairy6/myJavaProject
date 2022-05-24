package Lesson_3;

public class HomeWork3 {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        array[0] = new Employee("Kozlov I.B.", "director", "kozlov@office.by",
                789654123, 9000, 34);
        array[1] = new Employee("Ivanov V.B.", "accountant", "ivanov@office.by",
                897645000, 8700, 55);
        array[2] = new Employee("Sidorov I.B.", "manager", "sidorov@office.by",
                745389005, 7800, 32);
        array[3] = new Employee("Ivanova V.B.", "secretary", "ivanova@office.by",
                987126540, 4500, 25);
        array[4] = new Employee("Ermilova V.B.", "specialist", "ermilova@office.by",
                76765432, 6700, 41);
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                array[i].printInfo();
            }
        }
    }
}

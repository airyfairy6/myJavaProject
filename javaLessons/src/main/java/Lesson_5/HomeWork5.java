import java.util.ArrayList;

public class HomeWork5 {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1
        Member array1[] = {
                new Member<>("00"),
                new Member<>("01"),
                new Member<>("02"),
                new Member<>("03")
        };
        change(array1, 0, 3);


        //ЗАДАНИЕ 2
        Box[] arrayB = {
                new Box<>("01"),
                new Box<>("02"),
                new Box<>("03"),
                new Box<>('4'),
                new Box<>('5'),

        };


        Box[] arrayTempO = new Box[3];
        Box[] arrayTempA = new Box[2];


        Orange[] arrayO = {
                new Orange<>("AA", 5),
                new Orange<>("BB", 5),
                new Orange<>("CC", 5)

        };
        ArrayList<Box> arrayOfOrange = new ArrayList<>();
        arrayOfOrange.add(new Box("AA"));
        arrayOfOrange.add(new Box("BB"));
        arrayOfOrange.add(new Box("CC"));


        Box[] arrayOO = new Box[arrayOfOrange.size()];
        arrayOfOrange.toArray(arrayOO);
        for (int i = 0; i < arrayOO.length; i++) {
            arrayTempO[i] = arrayOO[i];
        }


        Apple[] arrayA = {
                new Apple<>('A', 5),
                new Apple<>('B', 5),

        };
        ArrayList<Box> arrayOfApple = new ArrayList<>();
        arrayOfApple.add(new Box('A'));
        arrayOfApple.add(new Box('B'));

        Box[] arrayAA = new Box[arrayOfApple.size()];
        arrayOfApple.toArray(arrayAA);
        for (int i = 0; i < arrayAA.length; i++) {
            arrayTempA[i] = arrayAA[i];
        }
        System.out.println();
        fillTheBoxes(arrayB, arrayOO, arrayAA);
        System.out.println();

        System.out.println("Коробка " + arrayB[0].getNameO() + " заполняется апельсинами в количестве " + arrayB[0].addFruitToBoxO(arrayO[0]));
        System.out.println("Вес коробки " + arrayB[0].getNameO() + " формируется с учетом веса одного апельсина - " + arrayB[0].getWeightPerEachFruitBO(arrayO[0]));
        System.out.println("Вес коробки " + arrayB[0].getNameO() + " составляет " + arrayB[0].getWeight());


        System.out.println("Коробка " + arrayB[3].getNameA() + " заполняется яблоками в количестве " + arrayB[3].addFruitToBoxA(arrayA[0]));
        System.out.println("Вес коробки " + arrayB[3].getNameA() + " формируется с учетом веса одного яблока - " + arrayB[3].getWeightPerEachFruitBA(arrayA[0]));
        System.out.println("Вес коробки " + arrayB[3].getNameA() + " составляет " + arrayB[3].getWeight());
        System.out.println();

        System.out.println("Сравним вес коробок: " + arrayB[0].getNameO() + " и " + arrayB[3].getNameA());
        arrayB[0].compare(arrayB[1]);

        System.out.println();
        System.out.println("Коробку " + arrayB[1].getNameO() + " также наполним апельсинами в количестве " + arrayB[1].addFruitToBoxO(arrayO[1]));
        System.out.println();
        arrayB[0].passOrange(arrayB[1]);
        System.out.println("Все содержимое в коробке " + arrayB[0].getNameO() + " переместим в коробку " + arrayB[1].getNameO());
        System.out.println("В коробке " + arrayB[0].getNameO() + " осталось " + arrayB[0].getFullness() + " фруктов");
        System.out.println("В коробке " + arrayB[1].getNameO() + " стало " + arrayB[1].getFullness() + " фруктов");

    }


    //ЗАДАНИЕ 1
    public static void change(Member[] array1, int firstToChange, int secondToChange) {
        if (firstToChange > 3 || firstToChange < 0 || firstToChange > 3 || secondToChange < 0) {
            System.out.println("введены несуществующие индексы членов массива");
        }
        Member a = array1[firstToChange];

        for (int i = 0; i < array1.length; i++) {
            if (i == firstToChange) {
                array1[firstToChange] = array1[secondToChange];
            }
            if (i == secondToChange) {
                array1[secondToChange] = a;
            }
            System.out.println(array1[i].getName());
        }
    }

    //ЗАДАНИЕ 2

    public static void fillTheBoxes(Box[] arrayB, Box[] arrayTempO, Box[] arrayTempA) {

        for (int i = 0; i < arrayB.length; i++) {
            if (i <= 2) {
                arrayB[i] = arrayTempO[i];
                System.out.println("Коробка  для апельсин с  именем: " + arrayB[i].getNameO());

            } else if (i > 2) {
                arrayB[i] = arrayTempA[i - 3];
                System.out.println("Коробка  для яблок с именем: " + arrayB[i].getNameA());
            }
        }
    }
}

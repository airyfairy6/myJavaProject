import java.util.ArrayList;
public class HomeWork5 {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1
        Member[] array = {
                new Member<>("00"),
                new Member<>("01"),
                new Member<>("02"),
                new Member<>("03")
        };

        change(array, 0, 3);



        //ЗАДАНИЕ 2
        Box[] arrayB = new Box[5];
        Box[] arrayTempO = new Box[3];
        Box[] arrayTempA = new Box[2];


        Orange[] arrayO = {
                new Orange<>(10),
                new Orange<>(20),
                new Orange<>(30)

        };
        ArrayList<Box> arrayOfOrange= new ArrayList<>();
arrayOfOrange.add(new Box(10));
        arrayOfOrange.add(new Box(20));
        arrayOfOrange.add(new Box(30));


Box[]arrayOO=new Box[arrayOfOrange.size()];
arrayOfOrange.toArray(arrayOO);
for (int i=0; i<arrayOO.length;i++){
    arrayTempO[i]=arrayOO[i];
}


        Apple[] arrayA = {
                new Apple<>(10.1),
                new Apple<>(20.1),

        };
    ArrayList<Box> arrayOfApple= new ArrayList<>();
        arrayOfApple.add(new Box(10.1));
        arrayOfApple.add(new Box(20.1));

        Box[]arrayAA=new Box[arrayOfApple.size()];
        arrayOfApple.toArray(arrayAA);
        for (int i=0; i<arrayAA.length;i++){
            arrayTempA[i]=arrayAA[i];
        }
        System.out.println();
  fillTheBoxes(arrayB,arrayOO,arrayAA);
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

    public static void fillTheBoxes(Box[]arrayB,Box[] arrayTempO ,  Box[] arrayTempA ) {

        for (int i = 0; i < arrayB.length; i++) {
            if (i<=2) {
                arrayB[i] = arrayTempO[i];
                System.out.println(arrayB[i].getNameO());
            }else{
            if (i>2) {
                arrayB[i] = arrayTempA[i-3];
                System.out.println(arrayB[i].getNameA());
            }}
        }

    }


    }
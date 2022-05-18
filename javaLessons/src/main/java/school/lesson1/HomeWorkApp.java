package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
      printThreeWords();
      checkSumSign(0,8);
      printColor(101);
      compareNumbers(9,8);
        }
        public static void printThreeWords( ){
            System.out.println("Orange\n" +
                    "Banana\n" +
                    "Apple\n");
    }
    public static void checkSumSign (int a, int b){
        int c= a+b;
        if (c>=0){
            System.out.println("Сумма положительна");
        }else
        {
            System.out.println("Сумма отрицательна");
        }}
        public static void printColor(int value){
            if (value<=0){
                System.out.println("Красный");
            }
            if (value>0&&value<=100){
                System.out.println("Желтый");
            }if(value>100) {
                System.out.println("Зеленый");
            }

    }
    public static void compareNumbers(int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}

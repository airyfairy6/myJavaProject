public class Array {
        public static int array(String[][] a) throws MyArraySizeException, MyArrayDataException {
            int sum = 0;
            if (a.length != 4) {
                throw new MyArraySizeException("");
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i].length != 4) {
                    throw new MyArraySizeException("");
                }
                for (int j = 0; j < a[i].length; j++) {
                    try {
                        int x = Integer.parseInt(a[i][j]);
                        sum = sum + x;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }

                }

            }
            return sum;
        }


    }

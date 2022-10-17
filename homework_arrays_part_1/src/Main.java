public class Main {
    public static void main(String[] args) {

        int [] intArray = new int [3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double [] doubleArray = {-1.57, 7.654, 9.986};
        boolean [] booleanArray = {true, true, false, true};

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.print(booleanArray[i]);
            if (i < booleanArray.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        for (int i = intArray.length; i > 0; i--) {
            System.out.print(intArray[i - 1]);
            if (i != 1) {
                System.out.print(", ");
            } else System.out.println();
        }
        for (int i = doubleArray.length; i > 0; i--) {
            System.out.print(doubleArray[i - 1]);
            if (i != 1) {
                System.out.print(", ");
            } else System.out.println();
        }
        for (int i = booleanArray.length; i > 0; i--) {
            System.out.print(booleanArray[i - 1]);
            if (i != 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + 1);
            }
            if (i < intArray.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }

    }
}
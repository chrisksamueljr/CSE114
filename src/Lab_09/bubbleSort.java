package Lab_09;

public class bubbleSort {
    public static void main(String[] args) {
        double[] bubbleSort_Array = new double[7];

        calibrateArray(bubbleSort_Array);
        
        double[] bubbleSorted_array = sort(bubbleSort_Array);
        loopAndPrintThroughArray(bubbleSorted_array);
    }

    public static double[] sort(double[] array) {
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j < array.length - 1; j++)
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
        return array;
    }

    public static void loopAndPrintThroughArray(double[] method_array) {
        for (int index = 0; index < method_array.length; index++) {
            System.out.println(method_array[index]);
        }
    }
    public static void calibrateArray(double[] uncalibratedArray) {
        double[] bubbleSort_Array = uncalibratedArray;
        bubbleSort_Array[0] = 6.0;
        bubbleSort_Array[1] = 4.4;
        bubbleSort_Array[2] = 1.9;
        bubbleSort_Array[3] = 2.9;
        bubbleSort_Array[4] = 3.4;
        bubbleSort_Array[5] = 2.9;
        bubbleSort_Array[6] = 3.5;
      }
}
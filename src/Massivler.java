import java.util.List;

public class Massivler {
    public static void main(String[] args) {
//        int[]array1={2,3,5,7,8,9};
//        int[]array2 = {1,2,4,6,7,9};
//        int i = 0, j = 0;
//
//        System.out.print("Ortaq elementlər: ");
//
//        while (i < array1.length && j < array2.length) {
//            if (array1[i] == array2[j]) {
//                System.out.print(array1[i] + " ");
//                i++;
//                j++;
//            } else if (array1[i] < array2[j]) {
//                i++;
//            } else {
//                j++;
//            }
//        }


//int[] array = {2, 4, 6, 8, 10};
//int cem = 0;
//
//        for (int i = 0; i < array.length; i++) {
//cem += array[i];
//        }
//
//double ortalama = (double) cem / array.length;
//
//        System.out.println("Array elementlərinin ortalaması: " + ortalama);


        int[] array = {2, 4, 6, 8, 10};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

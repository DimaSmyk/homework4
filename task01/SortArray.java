package selfwork04.task01;

public class SortArray {

    public static void main(String[] args) {


        int[] elements = {23, 71, 1, 6, 2, 19, 12, 4};

        insertionSort(elements);

        for (int element : elements) {
            System.out.print(element + " ");
        }
    }

    private static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int point = elements[i];
            int j = i - 1;
            while (j >= 0 && point < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = point;
        }
    }
}

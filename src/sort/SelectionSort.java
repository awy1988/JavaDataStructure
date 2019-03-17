package sort;

public class SelectionSort {

    /**
     * 选择排序
     */
    public static void sort(int[] arrayToBeSorted) {

        int count = 0;
        int minValue;
        int minValueIndex;
        for (int i = 0; i < arrayToBeSorted.length; i++) {
            minValue = arrayToBeSorted[i];
            minValueIndex = i;
            for (int j = i; j < arrayToBeSorted.length; j++) {
                if (minValue > arrayToBeSorted[j]) {
                    minValue = arrayToBeSorted[j];
                    minValueIndex = j;
                }
                count++;
            }
            SortHelper.swap(arrayToBeSorted,i,minValueIndex);
        }

        System.out.println("选择排序的比较次数是：" + count);
    }

}

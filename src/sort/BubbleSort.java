package sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * 手工实现冒泡排序，用最最原始和简单的方式
     * @param arrayToBeSorted 要被排序的数组
     */
    public static void simpleSort(int[] arrayToBeSorted) {
        if (arrayToBeSorted == null || arrayToBeSorted.length == 0) {
            return;
        }

        // 冒泡排序的过程就是每次比较相邻的两个数组元素，如果第一个元素大于第二个元素，那么交换两个元素的位置，
        // 如果第一个元素小于第二个有元素，那么什么也不做
        // 由于每次循环一遍只能让一个元素冒泡到最上面，
        // 所以我们为了让所有的元素都能回到最上面，我们必须对数组进行元素个数次冒泡才能使所有的元素都有序
        // 因此，传统最简单的冒泡排序的时间复杂度是 n*n = n方
        // 这个过程明显是可以改善的，比如：1）减少比较的次数，2）记录列表是否已经有序，如果有序则终止冒泡
        // 我们将在后面的方法中做出这些尝试，并计算改进后的冒泡排序的时间复杂度
        int count = 0;
        for (int j = 0; j < arrayToBeSorted.length; j++) {
            for (int i = 0; i < arrayToBeSorted.length - 1; i++) {
                // 循环到length - 1 以防止数组越界
                if (arrayToBeSorted[i] > arrayToBeSorted[i+1]) {
                    SortHelper.swap(arrayToBeSorted, i, i+1);
                }
                count++;
            }
        }
        System.out.println("最原始的方式下，冒泡排序的比较次数是：" + count);
    }

    /**
     * 改进的冒泡排序
     * 从两个方面改进：1）比较的次数，2）每次冒泡判断数组是否已经有序，有序则结束冒泡
     */
    public static void improvementSort(int[] arrayToBeSorted) {

        if (arrayToBeSorted == null || arrayToBeSorted.length == 0) {
            return;
        }

        // 判断数组是否已经有序
        int count = 0;
        boolean isArraySorted = false;
        for (int j = 0; j < arrayToBeSorted.length; j++) {
            // 每次冒泡开始之前，假设数组已经有序
            isArraySorted = true;
            for (int i = 0;
                 i < arrayToBeSorted.length - 1 - j; // 这里 -j 减少冒泡的次数
                 i++) {
                if (arrayToBeSorted[i] > arrayToBeSorted[i+1]) {
                    SortHelper.swap(arrayToBeSorted, i, i+1);
                    // 一旦发生元素交换，认为数组并没有完全有序
                    isArraySorted = false;
                }
                count++;
            }
            if (isArraySorted) { // 这里判断是否数组已经有序，如果已经有序，则不需要再进行继续循环
                break;
            }
        }
        System.out.println("改进的方式下，冒泡排序的比较次数是：" + count);

        // 抛出结论的时候到了，改进的模式下，循环比较的次数与数组本身的有序程度有很大关系，
        // 如果数组本身就有很多元素是有序的，那么所花费的时间复杂度可能会很小，当然也不是完全的
        // 如果数组整个是反向排序的，此时为最坏情况，但是比较次数相较于完全没有优化过的排序算法还是有一半的节省。
        // 数组完全有序的情况下，为最好情况，只需要数组长度的比较即可完成排序算法，此时复杂度为n

    }

//    private static void swap(int[] a, int index) {
//        int temp;
//        temp = a[index];
//        a[index] = a[index + 1];
//        a[index + 1] = temp;
//    }

}

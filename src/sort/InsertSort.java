package sort;

/**
 * 插入排序
 */
public class InsertSort {


    /**
     * 插入排序
     * @param arrayToBeSorted
     */
    public static void sort(int[] arrayToBeSorted) {
        // 插入排序算法描述：
        // 将集合通过一个指针分为左右两个集合，左侧集合为局部有序集合，右侧集合为无序集合
        // 每次操作为，将指针所指的元素抽出，插入到左侧有序集合，然后指针右移

        // 定义指针
        // 指针其实就是一个概念，并不是真的指某个语言中的指针，尤其在java中，并没有语言层面的指针的概念
        // 指针可以是地址，也可以是数组下标，甚至可以是一个变量，我们这里定义的指针就是一个概念上的指针。

        int count = 0;
        int temp;
        // 注意，pointer实际上从1开始计数，也就是相当于我们将左边第一个元素初始化为一个有序集合
        for (int pointer = 1; pointer < arrayToBeSorted.length; pointer++) {
            // 取出指针元素
            temp = arrayToBeSorted[pointer];

            // 扫描有序集合，移动元素，将指针元素插入合适的位置
            // 注意，为了方便移动元素，要从后往前扫描有序集合，这样每次只需要移动一个元素即可，
            // 如果从前往后扫描，那么结果就是最后找到位置之后，需要将位置之后的所有元素一次性的移动，
            // 个人认为从后往前扫描的实现更加优雅一些。
            for (int j = pointer-1; j >= 0; j--) {
                count++;
                if (arrayToBeSorted[j] > temp) {
                    SortHelper.swap(arrayToBeSorted,j,j+1);
                } else {
                    // 如果扫描到的j位置上的元素已经不大于指针元素，那么我们已经找到了指针元素的位置，直接跳出循环即可。
                    break;
                }
            }

            // 扫描集合结束，指针右移(pointer++)

        }
        System.out.println("插入排序的比较次数是：" + count);
    }

    /**
     * 插入排序算法的另一种实现
     */
    public static void sort2(int[] arrayToBeSorted) {
        int count = 0;

        int temp;
        for (int i = 1; i < arrayToBeSorted.length; i++) {
            temp = arrayToBeSorted[i];
            int j = i - 1;
            for ( ;j >=0;j-- ) {
                if (arrayToBeSorted[j] <= temp) {
                    break;
                }
                arrayToBeSorted[j+1] = arrayToBeSorted[j];
            }
            // j的值为我们要插入位置的前一个位置的下标，
            // 为什么呢？
            // 因为：我们循环的逻辑是从j的位置上开始遍历，如果数组在j的这个位置上的值小于等于比较的值，那么就跳出循环
            // 这时我们就找到了第一个不大于本轮比较元素的值的位置，也就是我们要找的位置往前1位的位置，所以j+1就是我们
            // 的元素要插入的位置。
            arrayToBeSorted[j+1] = temp;
        }

        System.out.println("插入排序的比较次数是：" + count);
    }


}

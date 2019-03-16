package sort;

import java.util.Arrays;

class TestCase {
    /**
     * 测试冒泡排序
     */
    public void testBubbleSort() {
        int[] array = generateArrayToBeSorted();
        print(array);
        BubbleSort.simpleSort(array);
        print(array);
    }

    public void testImprovedBubbleSort() {
        int[] array = generateArrayToBeSorted();
        print(array);
        BubbleSort.improvementSort(array);
        print(array);
    }

    /**
     * 生成整型数组
     * @return
     */
    public int[] generateArrayToBeSorted() {
//        return new int[]{2,8,0,9,7,3,6,4,1,5,10};
//        return new int[]{1,0,2,3,4,5,6,7,9,8,10};
        return new int[]{0,1,2,3,4,5,6,7,8,9,10};
//        return new int[]{10,9,8,7,6,5,4,3,2,1,0};
    }


    /**
     * 打印整型数组
     * @param array
     */
    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
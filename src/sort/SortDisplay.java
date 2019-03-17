package sort;

public class SortDisplay {

    public static void main(String[] args) {
        System.out.println("程序测试开始");
//        testBubble();
//        testSelectionSort();
//        testInsertSort();
        testInsertSort2();
    }

    private static void testBubble() {

        TestCase testCase = new TestCase();
        testCase.testBubbleSort();
        System.out.println();
        testCase.testImprovedBubbleSort();
    }

    private static void testSelectionSort() {
        TestCase testCase = new TestCase();
        testCase.testSelectionSort();
    }

    private static void testInsertSort() {
        TestCase testCase = new TestCase();
        testCase.testInsertSort();
    }

    private static void testInsertSort2() {
        TestCase testCase = new TestCase();
        testCase.testInsertSort2();
    }
}

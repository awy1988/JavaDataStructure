package sort;

public class SortDisplay {

    public static void main(String[] args) {
//        testBubble();
    }

    private static void testBubble() {
        System.out.println("程序测试开始");
        TestCase testCase = new TestCase();
        testCase.testBubbleSort();
        System.out.println();
        testCase.testImprovedBubbleSort();
    }

}

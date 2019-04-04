public class UtilsTest {
    public static void main(String[] args) {
        //       System.out.println(Utils.fastModExp(10, 10, 3));
        //       System.out.println(Math.pow(10, 10) % 3);

        IntPair[] pairs = Utils.allPairs(new int[] {1, 2, 3});

        intToString(Utils.interleave(new int[] {1, 2, 3, 4}, new int[] {1, 2, 3}));
    }

    private static void intToString(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }
}

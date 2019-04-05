public class Utils {

  public static boolean contains(double[] dubs, double eps, double d) {
    for (double num : dubs) {
      if (Math.abs(num - d) < eps) {
        return true;
      }
    }
    return false;
  }

  public static int fastModExp(int x, int y, int m) {
    if (y == 0) {
      return 1 % m;
    }

    if (y % 2 == 0) {
      return fastModExp((x * x) % m, y / 2, m);
    } else {
      return x * fastModExp(x, y - 1, m) % m;
    }
  }

  public static IntPair[] allPairs(int[] nums) {
    if (nums.length == 0) {
      throw new IllegalArgumentException("Empty integer array");
    }

    IntPair[] pairs = new IntPair[nums.length * nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        pairs[i * nums.length + j] = new IntPair(nums[i], nums[j]);
      }
    }

    return pairs;
  }

  public static String concatAndReplicateAll(String[] arr, int n) {
    if (arr == null) {
      throw new IllegalArgumentException("null array"); // should it be NullPointerException tho?
    }

    String str = "";
    for (String s : arr) {
      for (int i = 0; i < n; i++) {
        str += s;
      }
    }

    return str;
  }

  public static int[] interleave(int[] arr1, int[] arr2) {
    int[] newArray = new int[arr1.length + arr2.length];
    int pos = 0;

    for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
      if (i < arr1.length) {
        newArray[pos++] = arr1[i];
      }
      if (i < arr2.length) {
        newArray[pos++] = arr2[i];
      }
    }

    return newArray;
  }
}

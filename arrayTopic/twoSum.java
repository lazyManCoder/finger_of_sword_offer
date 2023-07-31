import java.util.Arrays;

/**
 * 输入数组[1, 2, 4, 6, 10]
 * k 的值 8
 *
 * 下表分别是[1, 3]
 */

public class twoSum {
    public static void main(String[] args) {
        System.out.println("hello");

        int[] arr = new int[] {1, 2, 4, 6, 10};
        System.out.println(Arrays.toString(twoSum(arr, 8)));
    }


    public static int[] twoSum(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;


        while (i < j && arr[i] + arr[j] != k) {
            if (arr[i] + arr[j] < k) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {i, j};
    }
}

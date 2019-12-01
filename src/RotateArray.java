import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        System.out.println("Test");
        int len = nums.length;

        for (int i = 0; i < k; i ++) {
            int temp = nums[len - 1];
            int x = (nums.length - 2);
            for (int j = (nums.length - 1); j > 0; j--) {
                nums[j] = nums[x];
                System.out.println("X: " + x);
                System.out.println("j: " + j);
                x--;
            }
            nums[0] = temp;
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String args[]) {
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }
}
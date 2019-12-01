public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int[] store = new int[nums.length];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            store[x]++;
        }
        for (int i = 0; i < store.length; i++) {
            if (store[i] == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2 ,1, 2};
        System.out.println(singleNumber(nums));
    }
}

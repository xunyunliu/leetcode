import java.util.Arrays;
import java.util.List;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        int[] numSorted = nums.clone();
        Arrays.sort(numSorted);
        int lo = 0, hi = numSorted.length - 1;
        while (lo < hi) {
            if (numSorted[lo] + numSorted[hi] == target) {
                //System.out.println(numSorted[lo]+" "+numSorted[hi]);
                if (numSorted[lo] == numSorted[hi])
                    return findTwo(nums, numSorted[lo]);
                return new int[]{find(nums, numSorted[lo]), find(nums, numSorted[hi])};
            } else if (numSorted[lo] + numSorted[hi] > target) {
                hi--;
            } else
                lo++;
        }
        return null;
    }

    private int[] findTwo(int[] nums, int i) {
        int ans1 = -1;
        int ans2 = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i) {
                if (ans1 == -1)
                    ans1 = j;
                else {
                    ans2 = j;
                    return new int[]{ans1, ans2};
                }
            }
        }
        return new int[]{ans1, ans2};

    }

    private int find(int[] nums, int i) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i)
                return j;
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] nums = {3, 2, 4};
        solution1.twoSum(nums, 6);
    }

}

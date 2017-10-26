
public class Solution4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans1 = 0;
        int ans2;
        int medium_loc = (m + n + 1) / 2;
        int n1 = 0;
        int n2 = 0;
        int num = 0;


        if ((m + n) % 2 == 1) {
            if (m == 0)
                return nums2[(n - 1) / 2];
            if (n == 0)
                return nums1[(m - 1) / 2];

            while (n1 < m || n2 < n) {
                int left = (n1 == m) ? java.lang.Integer.MAX_VALUE : nums1[n1];
                int right = (n2 == n) ? java.lang.Integer.MAX_VALUE : nums2[n2];
                if (left <= right) {
                    n1++;
                    num++;
                    if (num == medium_loc)
                        return left;
                } else {
                    n2++;
                    num++;
                    if (num == medium_loc)
                        return right;
                }
            }
        } else {
            if (m == 0)
                return (float) (nums2[(n - 1) / 2] + nums2[(n + 1) / 2])/2;
            if (n == 0)
                return (float) (nums1[(m - 1) / 2] + nums1[(m + 1) / 2])/2;

            while (n1 < m || n2 < n) {
                int left = (n1 == m) ? java.lang.Integer.MAX_VALUE : nums1[n1];
                int right = (n2 == n) ? java.lang.Integer.MAX_VALUE : nums2[n2];

                if (left <= right) {
                    n1++;
                    num++;
                    if (num == medium_loc) {
                        ans1 = left;
                    }
                    if (num == medium_loc + 1) {
                        ans2 = left;
                        return (float) (ans1 + ans2) / 2;
                    }
                } else {
                    n2++;
                    num++;
                    if (num == medium_loc) {
                        ans1 = right;
                    }
                    if (num == medium_loc + 1) {
                        ans2 = right;
                        return (float) (ans1 + ans2) / 2;
                    }
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3};
        int[] nums2 = {1};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}

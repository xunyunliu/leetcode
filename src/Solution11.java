public class Solution11 {

    public static int maxArea(int[] height) {
        int len = height.length;
        int l = 0;
        int r = len-1;
        int max = 0;
        while (l<r){
            max = Math.max(max, Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 1,1,4};
        System.out.println(maxArea(height));
    }

}

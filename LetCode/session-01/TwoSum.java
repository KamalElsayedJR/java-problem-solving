import java.util.Arrays;

public class TwoSum {
    static void main() {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {

        for (int x=0; x < nums.length;x++){
            for (int j=x+1; j < nums.length;j++) {
                if (nums[x] +nums[j] == target){
                    return new int[]{x,j};
                }
            }
        }
        return new int[]{};
    }
}

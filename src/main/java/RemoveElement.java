import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        System.out.println("Input " + Arrays.toString(new int[] {3,2,2,3}) + " "+ 3);
        System.out.println("Output: " + removeElement(new int[] {3,2,2,3}, 3));
    }

    // Time Complexity: O(n), where 'n' is the length of the input array.
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

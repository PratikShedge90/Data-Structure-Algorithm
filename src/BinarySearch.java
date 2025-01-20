public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {7,9,11,13,17,21,23};
        int target = 11;

        int result = binarySearch(nums , target);
        if(result!=-1){
            System.out.println("The Target index is at " + result);
        }else{
            System.out.println("Element no Found ");
        }
    }
    public static int binarySearch(int[] nums, int target)
    {
        //7,9,11,13,17,21,23
        int left =0;
        int right = nums.length-1;
        while(left <= right)
        {
            int mid = (left + right) /2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else{
                right = mid -1;
            }
        }
        return -1;
    }
}

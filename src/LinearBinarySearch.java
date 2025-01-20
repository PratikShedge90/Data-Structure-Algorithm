public class LinearBinarySearch {
    public static void main(String[] args) {

        int[] nums = {5,7,9,11,13};

        int target = 11;

        int result = linearSearch(nums,target);
        if(result != 0) {
            System.out.println(result);
        }else{
            System.out.println("Not found the Index ");
        }


    }
    private static int linearSearch(int[] nums, int target) {
        for (int i=0; i< nums.length; i++ ) {
            if(nums[i] == target) {
                return i;
            }
        }
        return 0;
    }
}

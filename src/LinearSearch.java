public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {5,11,13,64,99,88};

        int target = 99;

        int result = linearSearch(arr, target);
        if(result != -1){
            System.out.println("Element Found at Index : " + result);
        }else{
            System.out.println("Element Not Found ");
        }

        }
        public static int linearSearch(int[] arr, int target)
        {

            for (int i=0; i< arr.length; i++)
            {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;

        }

    }




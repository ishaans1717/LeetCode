package leedcode;

public class Sum {
    public void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ( nums[j] == target - nums[i]){
                    System.out.println("{"+i+","+j+"}");
                }
            }


        }

    }

    public static void main(String[] args) {
       int[] numbers = {2, 7, 11, 15};
       int total = 26;
       Sum sum = new Sum();
       sum.twoSum(numbers,total);

    }
}

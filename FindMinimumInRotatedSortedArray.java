class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,1,2,3};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int first = 0;
        int last = nums.length-1;
        int midLength = nums.length / 2;
        int result;
        if (nums.length == 2) {
            return Math.min(nums[0],nums[1]);
        }
        if (nums[midLength] > nums[last]) {
            int[] newNums = new int[Math.round((float) nums.length / 2)];
            int indexCount = 0;
            for (int i = midLength;i<nums.length;i++) {
                newNums[indexCount] = nums[i];
                indexCount++;
            }
            result = findMin(newNums);
        } else if (nums[midLength] < nums[first])  {
            int[] newNums = new int[(nums.length / 2) + 1];
            for (int i = 0;i<newNums.length;i++) {
                newNums[i] = nums[i];
            }
            result = findMin(newNums);
        } else {
            return Math.min(nums[midLength],nums[0]);
        }
        return result;
    }
}
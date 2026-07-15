class Solution {
    public int[] searchRange(int[] nums, int target) {
    int n = nums.length;
    int high = n-1;
    int low = 0;
    int first = -1;
    int last =-1;

    while(low<=high){
        int guess = (low+high)/2;
        if(nums[guess]<target){
            low = guess+1;
        }
        if(nums[guess]>target){
           high = guess-1;
    }
    if(nums[guess]==target){
        first = guess;
        high = guess-1;
    }
 }
    high = n-1;
    low = 0;
     while(low<=high){
        int guess = (low+high)/2;
        if(nums[guess]<target){
            low = guess+1;
        }
        if(nums[guess]>target){
           high = guess-1;
    }
    if(nums[guess]==target){
        last = guess;
        low = guess+1;
    }
    }

    return new int[]{first,last};
}
}
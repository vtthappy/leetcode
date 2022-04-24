//较好
class Solution {
    public int arraySign(int[] nums) {
        int result =1;
        for(int i=0;i<nums.length;i++){  
            if(nums[i]==0){
                return 0;
            }
            else if( nums[i]<0)
                result *= -1;

        }
        return result>0?1:-1;
    }
}

//奇偶判断
class Solution {
    public int arraySign(int[] nums) {
        int negative =0;
        for(int i=0;i<nums.length;i++){  
            if(nums[i]==0){
                return 0;
            }
            else if( nums[i]<0)
                negative++;

        }
        return (negative%2) ==0?1:-1;
    }
}
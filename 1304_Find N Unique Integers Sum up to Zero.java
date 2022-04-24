class Solution {
    public int[] sumZero(int n) {
        int [] result =new int[n];
        int index=0;
        result[0]=0;
        for(int i=1; i<=n/2;i++){
            result[index++]=i;
            result[index++]=-i;
        }
        return result;
    }
}
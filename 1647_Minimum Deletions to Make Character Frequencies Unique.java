class Solution {
    public int minDeletions(String s) {
        char[] chars =s.toCharArray();//将String转换成char的数组
        int[] count = new int[26]; //26个字母初始化的数量都是0
        int result=0;
        Set<Integer> set = new HashSet<>();


        //获得26个字母的次数数组count；
        for(int i=0; i<chars.length;i++){
            count[chars[i]-'a']++; //char的数组的字母的个数，在count里面++
        }
        //如果出现重复的数字就把这个字母的数字-1
        for(int i =0;i<26;i++){
            int freq = count[i];
            while(freq>0){
                if(set.contains(freq)){
                    freq--;
                    result++;
                }
                else{
                    set.add(freq);
                    break;
                }
            }
        }
        return result;

    }
}
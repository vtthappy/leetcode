class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuffer sb = new StringBuffer();
        PriorityQueue<int[]> q = new PriorityQueue<>((x,y)->y[1]-x[1]);
        if(a>0){q.add(new int[]{0, a});}
        if(b>0){q.add(new int[]{1,b });}
        if(c>0){q.add(new int[]{2,c});}
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int n=sb.length();
            if((n>=2)&&(sb.charAt(n-1)-'a'==cur[0])&&(sb.charAt(n-2)-'a'==cur[0])){
                if(q.isEmpty()) break;
                int[] next = q.poll();
                sb.append((char)(next[0]+'a'));
                next[1]--;
                q.add(cur);
                if(next[1]!=0) q.add(next);
            }
            else{
                sb.append((char)(cur[0]+'a'));
                cur[1]--;
                if(cur[1]!=0) q.add(cur);
            }
        }
        return sb.toString();
    }
}
class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1; i<n+1; i++)
        {
            int ct=0;
            int k=i;
            while(k>0)
            {
                if((k&1)==1)ct++;
                k=k>>1;
            }
            arr[i]=ct;
        }
        return arr;
    }
}

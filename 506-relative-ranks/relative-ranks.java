class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];
        int[] sorted=score.clone();
        Arrays.sort(sorted);
        for(int i=0;i<n;i++){
            int rank=n-i;
            for(int j=0;j<n;j++){
                if(score[j]==sorted[i]){
                    if(rank==1){
                        ans[j]="Gold Medal";
                    }
                    else if(rank ==2){
                        ans[j]="Silver Medal";
                    }
                    else if(rank==3){
                        ans[j]="Bronze Medal";
                    }
                    else{
                        ans[j]=String.valueOf(rank);
                    }
                }
            }
        }
        return ans;
    }
}
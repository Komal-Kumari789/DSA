import java.util.Scanner;

class Solution {
    public int removeElement(int[] a, int val) {
        int l=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val){
                a[l]=a[i];
                l++;
            }
        }
        return l;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        int a[]={3,2,2,3,2};
        int val=2;
        int len=s.removeElement(a,val);
        System.out.print("[ ");
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" , ");
        }
        System.out.print("] ");
    }
}
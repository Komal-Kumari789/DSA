import java.util.Scanner;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs.length;
        String str="";
        char s;
        for(int i=0;i<strs[0].length();i++){
            int c=0;
            s=strs[0].charAt(i);
            for(int j=1;j<l;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != s){
                    return str;  
                } else {
                    c += 1;
                }
            }
            if(c==(l-1)){
                str+=s;
            }
        }
        return str;
    }
    public static void main(String[] args){
        Solution obj=new Solution();
        String arr[]={"cir","car"};
        String res=obj.longestCommonPrefix(arr);
        System.out.println("COMMON STRING IS: "+res);
    }
}
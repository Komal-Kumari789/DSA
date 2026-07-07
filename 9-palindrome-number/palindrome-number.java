class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int rem=0,rev=0,x1=x;
            while(x>0){
                rem=x%10;
                rev=rev*10+rem;
                x/=10;
            }
            if(rev==x1){
                return true;
            }
            else{
                return false;
            }
        }

    }
    public static void main(String[]args){
        boolean res=isPalindrome(2342);
        System.out.println(res);
    }
}
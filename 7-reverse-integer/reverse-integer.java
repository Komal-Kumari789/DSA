class Solution {
    public static int reverse(int x) {
        int rev=0,rem=0;
        while(x!=0){
        rem=x%10;
        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
        rev=rev*10+rem;
        x/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        int x=-2987;
        int r;
        if(x<0){
            x=x*(-1);
            r=reverse(x);
            System.out.println("-"+r);
        }
        else{
            r=reverse(x);
            System.out.println(r);
        }
    }
}
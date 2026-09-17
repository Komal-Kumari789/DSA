class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb=new StringBuilder(s1.toLowerCase());
        for(int i=0;i<sb.length()/2;i++){
            int f=i;
            int b=sb.length()-1-i;
            char frontChar=sb.charAt(f);
            char backChar=sb.charAt(b);
            sb.setCharAt(f,backChar);
            sb.setCharAt(b,frontChar);
        }
        if(sb.toString().equals(s1.toLowerCase())){
            return true;
        }
        return false;
    }
}
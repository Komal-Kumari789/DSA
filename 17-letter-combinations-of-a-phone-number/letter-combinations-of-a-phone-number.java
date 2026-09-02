class Solution {
    public List<String> letterCombinations(String d) {
        List<String> a=new ArrayList<>();
        if(d.length()==0)return a;
        String[] m={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        f(d,0,new StringBuilder(),a,m);
        return a;
    }
    void f(String d,int i,StringBuilder s,List<String> a,String[] m){
        if(i==d.length()){
            a.add(s.toString());
            return;
        }
        for(char c:m[d.charAt(i)-'0'].toCharArray()){
            s.append(c);
            f(d,i+1,s,a,m);
            s.deleteCharAt(s.length()-1);
        }
    }
}
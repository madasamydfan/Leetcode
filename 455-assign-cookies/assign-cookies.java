class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int CookiesPtr =0;
        int GreedPtr =0;
        int ChildrenFeeded =0;
        System.out.println(s.length);
        while(CookiesPtr<s.length && GreedPtr<g.length){
            System.out.println(CookiesPtr);
            if(g[GreedPtr]<=s[CookiesPtr]){
              ChildrenFeeded++;
               GreedPtr++;
            CookiesPtr++;
            }
            else{
                CookiesPtr++;
            }
           
        }
        return ChildrenFeeded;
    }
}
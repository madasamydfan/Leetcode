class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0;i<word1.length();i++){
            set1.add(word1.charAt(i));
            set2.add(word2.charAt(i));
        }
        if(!set1.equals(set2)){
            return false;
        }
        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();
        for(int i =0;i<word1.length();i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        ArrayList<Integer> list1 = new ArrayList<>(map1.values());
        ArrayList<Integer> list2 = new ArrayList<>(map2.values());
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)){
            return true;
        }
        else{
            return false;
        }
    }
}
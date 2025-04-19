class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] sortedWord = word.toCharArray();
            Arrays.sort(sortedWord);
            String sortedWordString = new String(sortedWord);
            if(!map.containsKey(sortedWordString)){
                map.put(sortedWordString,new ArrayList<>());
            }
            map.get(sortedWordString).add(word);
        }
        List<List<String>> list = new ArrayList<>();
        for(String w:map.keySet()){
            list.add(map.get(w));
        }
        return list;
    }
}
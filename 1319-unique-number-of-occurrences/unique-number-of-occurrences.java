class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        int prevlength=0;
        for(int num : map.values()){
            set.add(num);
            if(prevlength == set.size()){
                return false;
            }
            prevlength = set.size();
        }
        return true;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setOfnumbers = new HashSet<>();
        for(int num:nums){
            if(!setOfnumbers.contains(num)){
                setOfnumbers.add(num);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        int totalWater =0;
        Stack<Integer> rightMax = new Stack<>();
        rightMax.push(height[height.length-1]);
        for(int i=height.length-2;i>=1;i--){
            int temp = Math.max(rightMax.peek(),height[i]);
            rightMax.push(temp);
        }
        for(int i=1;i<height.length-1;i++){
            leftMax = Math.max(height[i],leftMax);
            int min = Math.min(leftMax,rightMax.peek());
            totalWater+= min - height[i];
            rightMax.pop();
        }
        return totalWater;
    }
}
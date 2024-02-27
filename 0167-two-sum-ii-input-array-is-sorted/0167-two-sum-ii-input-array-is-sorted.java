class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        while(startIndex < numbers.length-1){
            int checkIndex = startIndex+1;
            while(checkIndex < numbers.length){
                if((numbers[startIndex] + numbers[checkIndex]) == target){
                    return new int[]{startIndex+1,checkIndex+1};
                }
                checkIndex++;
            }
            startIndex++;
        }
        return new int[]{};
    }
}
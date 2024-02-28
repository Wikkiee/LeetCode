class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisonTime = 0;
        int i = 0;
        int counter = 0;
        int currentItem = 0;
        while(i<timeSeries.length){
            int start = timeSeries[i];
            int end = start + (duration - 1);
            while(start<=end){
                currentItem = start++;
                if( i+1<timeSeries.length && currentItem == timeSeries[i+1]){
                    break;
                }
                counter++;

            }
            i++;
                
        }
        return counter;
    }
}
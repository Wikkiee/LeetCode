class Solution {

    public int minCostClimbingStairs(int[] cost) {
        
        
	int n = cost.length;
	int[] dp = new int[n];
	for (int i=0; i<n; i++) {
		if (i<2) dp[i] = cost[i];
		else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
	}
	return Math.min(dp[n-1], dp[n-2]);
    
    
    
    
    
    
    
    
    //     int[] dp;
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         dp = new int[n];
//         return Math.min(getMin(cost,n-1),getMin(cost,n-2));
//     }
    
//     public int getMin(int[]cost,int n){
//         if(n<0){
//             return 0;
//         }
//         if(n == 0 || n == 1){
//             return cost[n];
//         }
//         if(dp[n] != 0){
//             return dp[n];
//         }
//         dp[n] = cost[n] + Math.min(getMin(dp[],n-1),getMin(cost,n-2));
//         return dp[n];
    }
}
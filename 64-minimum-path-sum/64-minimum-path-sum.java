class Solution {
    static int[][] dp ;
    
    public int minPathSum(int[][] grid) {
        
        dp = new int[grid.length][grid[0].length];
		
		return (minPath(grid , 0 , 0));
        
    }
    
    public int minPath(int[][] grid , int row , int col) {

		if(row == grid.length -1 && col == grid[0].length -1){
			return grid[row][col];
		}

		if(row < grid.length && col < grid[0].length){

			if(dp[row][col] == 0) {

				int i = minPath(grid , row + 1 , col);

				int j = minPath(grid , row , col + 1);

				if(i != Integer.MAX_VALUE || j != Integer.MAX_VALUE) {

					if(i < j) {
						dp[row][col] = i + grid[row][col];
					}
					else {
						dp[row][col] = j + grid[row][col];
					}
				}
				
				return dp[row][col];

			}

			return dp[row][col];
		}

		return Integer.MAX_VALUE;

	}
}
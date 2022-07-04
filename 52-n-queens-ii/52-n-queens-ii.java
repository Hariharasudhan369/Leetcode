class Solution {
    
    
    static int n;
	static int board[][];
	static int count;
    
    public int totalNQueens(int a) {
        n = a;
        count = 0;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        board = new int[a][a];
		solutionCount(0);
        return count;
    }
    
    public static int solutionCount(int row) {

		if(row >= n) {
			count++;
			return 0;
		}

		for(int i = 0; i < n; i++) {

			if(validatePosition( row, i)) { 

				board[row][i] = 1;
				board[row][i] = solutionCount(row+1);
			}
		}
		return 0;	 
	}
    
    public static boolean validatePosition( int row, int col) {

		int i, j;
		for (i = 0; i < row; i++) {
			if (board[i][col] == 1) {

				return false;
			}
		}

		for (i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--)
		{
			if (board[i][j] == 1) {
				return false;        	        		
			}
		}

		for (i = row, j = col; i >= 0 && j < n; i--, j++) {        	
			if (board[i][j] == 1) {
				return false;        		
			}
		}

		return true;
	}
}
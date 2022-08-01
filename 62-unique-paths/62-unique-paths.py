class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        
        uniq = [[0 for _ in range(m)] for _ in range(n)]
        
        for i in range(n):
            
            for j in range(m):
                
                if i==0 or j==0:
                    
                    uniq[i][j] = 1
                    
                else:
                    
                    uniq[i][j] = uniq[i-1][j] + uniq[i][j-1]
        
        return uniq[-1][-1]
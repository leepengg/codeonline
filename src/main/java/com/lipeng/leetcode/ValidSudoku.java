public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null){
            return false;
        }
        
        HashSet<Character> hash = new HashSet<Character>();
        
        for(int i=0; i<9; i++){
            hash.clear();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(!hash.add(board[i][j])){
                    return false;
                }
            }
            
        }
        
        
        for(int i=0; i<9; i++){
            hash.clear();
            for(int j=0; j<9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(!hash.add(board[j][i])){
                    return false;
                }
            }
            
        }
        
        for(int i=0; i<9; i +=3){
            for(int j=0; j<9; j +=3){
                hash.clear();
                if(!isValidSudoku(board, i, j, hash)){
                    return false;
                }
            }            
        }
        
        return true;
        
    }
    
    private boolean isValidSudoku(char[][] board, int m, int n, HashSet<Character> hash){
        for(int i=m; i<m+3; i++){
            for(int j=n; j<n+3; j++){
                 if(board[i][j] =='.'){
                    continue;
                }
                if(!hash.add(board[i][j])){
                    return false;
                }
            }
        }
        
        return true;
    }
}

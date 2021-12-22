class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Solution using Formula
        // TC - O(n*m)        
        // base case
//         if (r == 0 || c == 0 || r * c != mat.length*mat[0].length) return mat;
        
//         int[][] res = new int[r][c];
//         int rows = mat.length;
//         int columns = mat[0].length;
//         int count = 0;
        
//         for (int i=0; i<rows; i++){
//             for (int j=0; j<columns; j++){
//                 res[count/c][count%c] = mat[i][j];
//                 count++;
//             }
//         }
//         return res; 
        
        // Solution using queue
        // Add each element of matrix to queue
        // remove each element from queue and assign to res array
        // TC - O(n*m)
        
        // base case
        if (r == 0 || c == 0 || r*c != mat.length*mat[0].length) return mat;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                queue.add(mat[i][j]);
            }
        }
        
        int[][] res = new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                res[i][j] = queue.remove(); 
            }
        }
        
        return res;
    }
}
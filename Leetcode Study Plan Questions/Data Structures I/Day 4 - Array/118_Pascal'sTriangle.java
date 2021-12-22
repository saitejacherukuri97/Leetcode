class Solution {
    public List<List<Integer>> generate(int numRows) {
        // solution using DP
        // Take 2 list -> one list is to calculate the sum from prev row
        // then add this list to res list
        // similiarly loop thru all rows
        // TC - (n^2)
        
        ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        
        // base case
        if (numRows == 1) {
            res.get(0).add(1);
            return res;
        }
        
        // First row is always 1
        res.get(0).add(1);
        
        // loop thru all rows
        for (int row=1; row<numRows; row++){
            ArrayList<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = res.get(row-1);
            
            // First row is always 1
            currRow.add(1);

            // calculate middle values as per pascal triangle
            for (int j=1; j<row; j++)
            currRow.add(prevRow.get(j-1)+prevRow.get(j));
            
            // Last row is always 1
            currRow.add(1);
            
            //add currRow to res
            res.add(currRow);
        }
        return res;
    }
}
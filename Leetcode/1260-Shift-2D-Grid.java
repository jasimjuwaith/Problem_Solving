class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length; int col = grid[0].length; int total = row * col; k %= total;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < row;i++){
            List<Integer> r = new ArrayList<>();
            for(int j = 0;j < col;j++){
                r.add(0);            
            }
            res.add(r);
        }
        for(int i = 0;i < row;i++){

            for(int j = 0;j < col;j++){
                
                int oldIndex = i * col + j;
                int newIndex = (oldIndex + k) % total;
                int newRow = newIndex / col;
                int newCol = newIndex % col;

                res.get(newRow).set(newCol, grid[i][j]);
            }
        }
        return res;
    }
}

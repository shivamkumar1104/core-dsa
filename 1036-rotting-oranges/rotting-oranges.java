class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                }else if(grid[i][j] == 1){
                    freshCount++;
                }
                                
            }

        }
        if(freshCount == 0) return 0;
        int minutes = 0;

        int directions[][] = {{-1, 0}, {1, 0}, {0,-1}, {0, 1}};
        while(freshCount > 0 && !queue.isEmpty()){
            int size = queue.size();

            for(int k = 0; k< size; k++){
                int curr[] = queue.poll();
                int i = curr[0];
                int j = curr[1];

                for(int dir[] : directions){
                    int nr = i + dir[0];
                    int nc = j + dir[1];

                    if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        freshCount--;
                        queue.offer(new int[]{nr, nc});

                    }
                }
            }
            minutes++;

        }
        return freshCount == 0 ? minutes : -1;
    }
}
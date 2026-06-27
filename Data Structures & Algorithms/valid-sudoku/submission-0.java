class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> box = new HashMap<>();
        Map<Integer, Set<Integer>> colmap = new HashMap<>();
        // rows
        for (int i = 0; i < board.length; i++) {
            Set<Integer> row = new HashSet<>();
            if (i == 3 || i == 6) box = new HashMap<>();

            // columns
            int blockid = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (j == 3 || j == 6) blockid++;
                if (board[i][j] == '.')
                    continue;

                int value = Integer.parseInt(String.valueOf(board[i][j]));

                // 1. check if exist in row
                if (row.contains(value))
                    return false;
                else row.add(value);


                // 2. check if exist in col
                Set<Integer> col = colmap.getOrDefault(j, new HashSet<>());
                if (col.contains(value))
                    return false;
                else col.add(value);
                colmap.put(j, col);


                // 3. check if exist in box
                Set<Integer> boxSet = box.getOrDefault(blockid, new HashSet<>());
                if (boxSet.contains(value))
                    return false;
                else boxSet.add(value);
                box.put(blockid, boxSet);
            }
        }

        return true;
    }
}

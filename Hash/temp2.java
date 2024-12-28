class temp2 {
    public static boolean canMakeSquare(char[][] grid) {
        int white = 0;
        int black = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 'W') {
                    white++;
                } else {
                    black++;
                }
            }
            if (white == 4 || black == 4) {
                return true;
                
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String[][] grid = {
                { "B", "W", "B" },
                { "B", "W", "W" },
                { "B", "W", "W" }
        };

        // Convert String[][] to char[][]
        char[][] charGrid = new char[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                charGrid[i][j] = grid[i][j].charAt(0); // Take the first character of each string
            }
        }
        System.out.println(canMakeSquare(charGrid));
    }

}
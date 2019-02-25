public class MazeSolver {

    public boolean solveMaze(char[][] maze, Location location, char[][] visitedMaze) {
        boolean solved = false;

        int lenMaze = maze.length;
        int newX = location.getX();
        int newY = location.getY();
        int nextX;
        int nextY;
        char[][] myVisitedMaze = assignNewMaze(visitedMaze);

        if ((newX >= lenMaze) || (newY >= lenMaze) || (newX < 0) || (newY < 0) || (maze[newX][newY] == '0')) {
            solved = false;
        } else if (maze[newX][newY] == 'e') {
            solved = true;
        } else if ((maze[newX][newY] == '1') || (maze[newX][newY] == 's')) {
            if ((newX < lenMaze) && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX + 1; nextY = newY;
                Location nextLocation = new Location(nextX,nextY);
                solved = solveMaze(maze, nextLocation, myVisitedMaze);
                if (solved) return solved;
            }
            if ((newX > 0)  && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX - 1; nextY = newY;
                Location nextLocation = new Location(nextX,nextY);
                solved = solveMaze(maze, nextLocation,myVisitedMaze);
                if (solved) return solved;
            }
            if ((newY < lenMaze)  && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX; nextY = newY + 1;
                Location nextLocation = new Location(nextX,nextY);
                solved = solveMaze(maze, nextLocation,myVisitedMaze);
                if (solved) return solved;
            }
            if ((newY > 0)  && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX; nextY = newY - 1;
                Location nextLocation = new Location(nextX,nextY);
                solved = solveMaze(maze, nextLocation,myVisitedMaze);
                if (solved) return solved;
            }
        }

        return solved;
    }

    public char[][] initializeVisitedMaze(int mazeLen) {
        char[][] returnMaze = new char[mazeLen][mazeLen];

        for (int i = 0; i < mazeLen; i++) {
            for (int j = 0; j < mazeLen; j++) { returnMaze[i][j] = ' '; }
        }

        return returnMaze;
    }

    public char[][] assignNewMaze(char[][] inMaze) {
        char[][] returnMaze = new char[inMaze.length][inMaze.length];

        for (int i = 0; i < inMaze.length; i++) {
            for (int j = 0; j < inMaze.length; j++) { returnMaze[i][j] = inMaze[i][j]; }
        }

        return returnMaze;
    }
}

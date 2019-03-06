import java.util.Arrays;

public class MazeSolver {

    public Location findStartLocation(char[][] maze) {
        Location returnLocation = new Location(-1,-1);

        for (int x = 0; x < maze.length ; x++) {
            for (int y = 0; y < maze.length; y++) {
                if (maze[x][y] == 's') {
                    returnLocation.setX(x);
                    returnLocation.setY(y);
                    break;
                }
            }
            if (returnLocation.getY() != -1) {
                break;
            }
        }

        return returnLocation;
    }

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
            printCharArray(myVisitedMaze);
        } else if (maze[newX][newY] == 'e') {
            solved = true;
            myVisitedMaze[newX][newY] = 'e';
            printCharArray(myVisitedMaze);
        } else if ((maze[newX][newY] == '1') || (maze[newX][newY] == 's')) {
            if ((newX < lenMaze) && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX + 1; nextY = newY;
                Location nextLocation = new Location(nextX,nextY);
                printCharArray(myVisitedMaze);
                solved = solveMaze(maze, nextLocation, myVisitedMaze);
                if (solved) return solved;
            }
            if ((newX > 0)  && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX - 1; nextY = newY;
                Location nextLocation = new Location(nextX,nextY);
                printCharArray(myVisitedMaze);
                solved = solveMaze(maze, nextLocation,myVisitedMaze);
                if (solved) return solved;
            }
            if ((newY < lenMaze)  && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX; nextY = newY + 1;
                Location nextLocation = new Location(nextX,nextY);
                printCharArray(myVisitedMaze);
                solved = solveMaze(maze, nextLocation,myVisitedMaze);
                if (solved) return solved;
            }
            if ((newY > 0)  && (visitedMaze[newX][newY] != 'v')) {
                myVisitedMaze[newX][newY] = 'v';
                nextX = newX; nextY = newY - 1;
                Location nextLocation = new Location(nextX,nextY);
                printCharArray(myVisitedMaze);
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

    public void printCharArray(char[][] inArray) {
        return;
//        String outString = Arrays.deepToString(inArray);
//        outString = outString.replaceAll("\\[\\[","*");
//        outString = outString.replaceAll("]]", "*" + "---" + System.getProperty("line.separator"));
//        outString = outString.replaceAll("]","*" + System.getProperty("line.separator"));
//        outString = outString.replaceAll(", \\[","*");
//        outString = outString.replaceAll(", ","");
//        System.out.println(outString);
    }
}

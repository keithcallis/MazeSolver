import org.junit.*;
import org.junit.Assert;

public class SolveMazeTest {

    @Test
    public void Maze_3x3_Solved_Test() {

        System.out.println("in Maze_3x3_Solved_Test");

        char maze[][] = new char[][]{
                {'s', '1', '1'},
                {'1', '0', '0'},
                {'1', '1', 'e'}};

        Location startLocation = new Location(0,0);
        MazeSolver solver = new MazeSolver();
        char visited[][] = solver.initializeVisitedMaze(maze.length);

        boolean actual = solver.solveMaze(maze,startLocation,visited);

        Assert.assertEquals("3 x 3 maze solved", true, actual);

    }

    @Test
    public void Maze_3x3_NotSolved_Test() {

        System.out.println("in Maze_3x3_NotSolved_Test");

        char maze[][] = new char[][]{
                {'s', '1', '0'},
                {'1', '0', 'e'},
                {'1', '1', '0'}};

        Location startLocation = new Location(0,0);
        MazeSolver solver = new MazeSolver();
        char visited[][] = solver.initializeVisitedMaze(maze.length);

        boolean actual = solver.solveMaze(maze,startLocation,visited);

        Assert.assertEquals("3 x 3 maze not solved", false, actual);

    }

    @Test
    public void Maze_10x10_NotSolved_Test() {

        System.out.println("in Maze_10x10_Solved_Test");

        char maze[][] = new char[][]{
                {'0','0','0','1','1','1','1','s','0','0'},
                {'0','0','0','1','0','0','0','0','e','0'},
                {'0','0','0','1','0','0','0','0','0','0'},
                {'0','0','1','1','0','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','1','1'},
                {'0','1','1','0','0','0','0','0','1','0'},
                {'0','1','0','0','0','0','0','0','1','0'},
                {'0','1','0','0','0','0','0','0','1','0'},
                {'1','1','1','1','1','1','1','1','1','1'},
        };

        Location startLocation = new Location(0,7);
        MazeSolver solver = new MazeSolver();
        char visited[][] = solver.initializeVisitedMaze(maze.length);

        boolean actual = solver.solveMaze(maze,startLocation,visited);

        Assert.assertEquals("10 x 10 maze notsolved", false, actual);

    }

    @Test
    public void Maze_10x10_Solved_Test() {

        System.out.println("in Maze_10x10_Solved_Test");

        char maze[][] = new char[][]{
                {'0','0','0','1','1','1','1','s','0','0'},
                {'0','0','0','1','0','0','0','0','0','0'},
                {'0','0','0','1','0','0','0','0','0','0'},
                {'0','0','1','1','0','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','1','e'},
                {'0','1','1','0','0','0','0','0','1','0'},
                {'0','1','0','0','0','0','0','0','1','0'},
                {'0','1','0','0','0','0','0','0','1','0'},
                {'1','1','1','1','1','1','1','1','1','1'},
        };

        Location startLocation = new Location(0,7);
        MazeSolver solver = new MazeSolver();
        char visited[][] = solver.initializeVisitedMaze(maze.length);

        boolean actual = solver.solveMaze(maze,startLocation,visited);

        Assert.assertEquals("10 x 10 maze solved", true, actual);

    }

    @Test
    public void Maze_30x30_Solved_Test() {

        System.out.println("in Maze_30x30_Solved_Test");

        char maze[][] = new char[][]{
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','e','0','0'},
                {'1','1','s','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0','0','0'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        };

        Location startLocation = new Location(2,2);
        MazeSolver solver = new MazeSolver();
        char visited[][] = solver.initializeVisitedMaze(maze.length);

        boolean actual = solver.solveMaze(maze,startLocation,visited);

        Assert.assertEquals("30 x 30 maze solved", true, actual);

    }

}
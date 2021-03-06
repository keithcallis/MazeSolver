public class MainMazeSolver {

    public static void main(String[] args) {

        /*
        solve maze starting at 's' and ending at 'e' by following '1' path
         */

        char maze[][] = {
                {'s','1','1'},
                {'1','0','0'},
                {'1','1','e'}};

        Location startLocation;

        MazeSolver mazeSolver = new MazeSolver();
        startLocation = mazeSolver.findStartLocation(maze);
        char visited[][] = mazeSolver.initializeVisitedMaze(maze.length);

        boolean mazedSolved = mazeSolver.solveMaze(maze, startLocation, visited);

        System.out.printf("Maze in main was solved: %s%n", mazedSolved);

    }

}
